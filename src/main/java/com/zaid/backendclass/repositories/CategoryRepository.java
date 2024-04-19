package com.zaid.backendclass.repositories;

import com.zaid.backendclass.models.Category;
import com.zaid.backendclass.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Override
    Category save(Category category);
}