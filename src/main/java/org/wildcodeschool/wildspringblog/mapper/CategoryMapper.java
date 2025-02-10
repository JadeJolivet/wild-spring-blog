package org.wildcodeschool.wildspringblog.mapper;

import org.springframework.stereotype.Component;
import org.wildcodeschool.wildspringblog.dto.ArticleDTO;
import org.wildcodeschool.wildspringblog.dto.CategoryDTO;
import org.wildcodeschool.wildspringblog.model.Category;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryMapper {
    public CategoryDTO convertToDTO(Category category) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());
        if(category.getArticles() != null) {
            categoryDTO.setArticles(category.getArticles().stream().map(article -> {
                ArticleDTO articleDTO = new ArticleDTO();
                articleDTO.setId(article.getId());
                articleDTO.setTitle(article.getTitle());
                articleDTO.setContent(article.getContent());
                articleDTO.setUpdatedAt(article.getUpdatedAt());
                articleDTO.setCategoryName(article.getCategory().getName());
                return articleDTO;
            }).collect(Collectors.toList()));
        }
        return categoryDTO;
    }

    public List<CategoryDTO> convertToDTOList(List<Category> categories) {
        return categories.stream().map(this::convertToDTO).collect(Collectors.toList());
    }
}
