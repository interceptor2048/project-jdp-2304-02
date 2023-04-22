package com.kodilla.ecommercee.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ProductsInCartDto {

    private Long productsInCartId;
    private Long cartId;
    private Long productId;
    private int productQuantity;
}
