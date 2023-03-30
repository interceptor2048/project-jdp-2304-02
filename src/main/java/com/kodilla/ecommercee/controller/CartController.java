package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.domain.dto.CartDto;
import com.kodilla.ecommercee.domain.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/shop/cart")
@RequiredArgsConstructor
public class CartController {

    @PostMapping
    public Long createEmptyCart(){
        Long cartId = 1L;
        return cartId;
    }
    @GetMapping("{cartId}")
    public CartDto fetchProductsInCart(@PathVariable long cartId){
        List<ProductDto> productList = new ArrayList<>();
        productList.add(new ProductDto(1,
                "product 1",
                "Test",
                10,
                "1"));
        productList.add(new ProductDto(2,
                "product 2",
                "Test",
                20,
                "1"));
        CartDto cartDto = new CartDto(productList);
        return cartDto;
    }
    @PutMapping("{cartId}/{productId}")
    public void addProductToCart(@PathVariable long cartId, @PathVariable long productId){
        System.out.println("product " + productId + " added to " + cartId);
    }
    @DeleteMapping("{cartId}/{productId}")
    public void removeProductFromCart(@PathVariable long cartId, @PathVariable long productId){
        System.out.println("element " + productId + " removed from " + cartId);
    }
    @PostMapping("{cartId}/create_order")
    public void createOrder(@PathVariable long cartId){
        System.out.println("Order created for cart " + cartId);
    }

}
