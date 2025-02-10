package org.wildcodeschool.wildspringblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wildcodeschool.wildspringblog.model.Author;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    List<Author> findByFirstNameAndLastName(String firstName, String lastName);
    List<Author> findByFirstName(String firstName);
    List<Author> findByLastName(String lastName);
}
