package org.wildcodeschool.wildspringblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wildcodeschool.wildspringblog.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
