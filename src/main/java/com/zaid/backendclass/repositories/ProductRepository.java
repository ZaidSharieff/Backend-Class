package com.zaid.backendclass.repositories;

import com.zaid.backendclass.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Override
    @NonNull
    Optional<Product> findById(@NonNull Long id);

    @Override
    @NonNull
    Product save(@NonNull Product product);
}