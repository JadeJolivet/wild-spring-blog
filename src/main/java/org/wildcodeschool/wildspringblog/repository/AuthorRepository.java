package org.wildcodeschool.wildspringblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wildcodeschool.wildspringblog.model.Author;


public interface AuthorRepository extends JpaRepository<Author, Long> {
}
