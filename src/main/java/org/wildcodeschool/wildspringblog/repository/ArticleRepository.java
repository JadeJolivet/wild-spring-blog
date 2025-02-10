package org.wildcodeschool.wildspringblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wildcodeschool.wildspringblog.model.Article;

import java.time.LocalDateTime;
import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    List<Article> findByTitle(String searchTerms);

    List<Article> findByContentContaining(String content);

    List<Article> findByCreatedAtAfter(LocalDateTime date);

    List<Article> findTop5ByOrderByCreatedAtDesc();
}
