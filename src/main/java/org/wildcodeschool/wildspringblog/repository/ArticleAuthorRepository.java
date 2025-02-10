package org.wildcodeschool.wildspringblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wildcodeschool.wildspringblog.model.ArticleAuthor;

public interface ArticleAuthorRepository extends JpaRepository<ArticleAuthor, Long> {
}