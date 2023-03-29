package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.domain.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1/shop/products")
@RequiredArgsConstructor
public class ProductController {

    @GetMapping
    public List<ProductDto> getAllProducts() {
        return new ArrayList<>();
    }

    @GetMapping("/{id}")
    public ProductDto getProductById(@PathVariable Long id) {
        return new ProductDto(1L, "Coat", "Black and White", new BigDecimal(1500), 1L);
    }

    @PostMapping
    public void addProduct(@RequestBody ProductDto productDto) {

    }

    @PutMapping("/{id}")
    public ProductDto updateProduct(@RequestBody ProductDto productDto) {
        return new ProductDto(1L, "Coat", "Black and White", new BigDecimal(1300), 1L);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {

    }
}