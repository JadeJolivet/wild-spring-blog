package org.wildcodeschool.wildspringblog.mapper;

import org.springframework.stereotype.Component;
import org.wildcodeschool.wildspringblog.dto.ImageDTO;
import org.wildcodeschool.wildspringblog.model.Article;
import org.wildcodeschool.wildspringblog.model.Image;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ImageMapper {
    public ImageDTO convertToDTO(Image image) {
        ImageDTO imageDTO = new ImageDTO();
        imageDTO.setId(image.getId());
        imageDTO.setUrl(image.getUrl());
        if (image.getArticles() != null) {
            imageDTO.setArticleIds(image.getArticles().stream().map(Article::getId).collect(Collectors.toList()));
        }
        return imageDTO;
    }

    public List<ImageDTO> convertToDTOList(List<Image> images) {
        return images.stream().map(this::convertToDTO).collect(Collectors.toList());
    }
}