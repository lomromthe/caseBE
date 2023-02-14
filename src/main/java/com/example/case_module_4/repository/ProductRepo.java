package com.example.case_module_4.repository;

import com.example.case_module_4.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends PagingAndSortingRepository<Product,Integer> {
}
