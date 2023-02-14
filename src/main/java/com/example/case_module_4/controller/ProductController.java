package com.example.case_module_4.controller;

import com.example.case_module_4.model.Product;
import com.example.case_module_4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("/{id}")
    public Product showEdit(@PathVariable int id) {
        return productService.findById(id);
    }

    @PutMapping("/{id}")
    public Product edit(@RequestBody Product product) {
        return productService.save(product);
    }

    @DeleteMapping("/{id}")
    public Product delete(@RequestBody int id) {
        return productService.delete(id);
    }


}