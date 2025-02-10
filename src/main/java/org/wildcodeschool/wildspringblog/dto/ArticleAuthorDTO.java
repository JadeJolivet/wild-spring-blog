package org.wildcodeschool.wildspringblog.dto;

import org.wildcodeschool.wildspringblog.model.ArticleAuthor;

public class ArticleAuthorDTO {
    private Long id;
    private Long articleId;
    private String articleTitle;
    private Long authorId;
    private String contribution;
    private AuthorDTO author;

    public ArticleAuthorDTO(Long id, Long articleId, String articleTitle, Long authorId, String contribution, AuthorDTO author) {
        this.id = id;
        this.articleId = articleId;
        this.articleTitle = articleTitle;
        this.authorId = authorId;
        this.contribution = contribution;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getContribution() {
        return contribution;
    }

    public void setContribution(String contribution) {
        this.contribution = contribution;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }
}
