package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.domain.dto.OrderDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1/shop/orders")
@RequiredArgsConstructor
public class OrderController {

    @GetMapping
    public List<OrderDto> getOrders(){
        return new ArrayList<>();
    }

    @GetMapping(value = "{orderId}")
    public OrderDto getOrder(@PathVariable Long orderId){
        return new OrderDto(1L,1L,1L, LocalDate.now(), "In progress", new BigDecimal(255));
    }

    @PostMapping
    public void createOrder(@RequestBody OrderDto orderDto){
    }


    @PutMapping
    public OrderDto updateOrder(@RequestBody OrderDto orderDto){
        return new OrderDto(1L,1L,1L, LocalDate.now(),"ended", new BigDecimal(255));
    }


    @DeleteMapping(value = "{orderId}")
    public void deleteOrder(@PathVariable Long orderId){
    }

}

