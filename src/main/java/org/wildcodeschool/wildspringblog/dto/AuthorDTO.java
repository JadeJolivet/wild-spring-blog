package org.wildcodeschool.wildspringblog.dto;

import java.util.List;

public class AuthorDTO {
    private Long id;
    private String firstname;
    private String lastname;
    private List<ArticleAuthorDTO> articleAuthors;

    public AuthorDTO(Long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<ArticleAuthorDTO> getArticleAuthors() {
        return articleAuthors;
    }
    public void setArticleAuthors(List<ArticleAuthorDTO> articleAuthors) {
        this.articleAuthors = articleAuthors;
    }
}
