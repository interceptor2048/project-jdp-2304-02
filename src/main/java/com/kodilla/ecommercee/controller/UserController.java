package com.kodilla.ecommercee.controller;


import com.kodilla.ecommercee.domain.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/shop/users")
@RequiredArgsConstructor
public class UserController {

    @GetMapping
    public List<UserDto> getAllUsers() {
        return new ArrayList<>();
    }

    @GetMapping(value = "{userId}")
    public UserDto getUser(@PathVariable Long userId) {
        return new UserDto(1, "Gawlas", 1, 555);
    }

    @DeleteMapping
    public void deleteUser(Long userId) {
    }

    @PutMapping
    public UserDto updateUser(UserDto userDto) {
        return new UserDto(1, "Gawlassss", 0, 555);
    }

    @PostMapping
    public void createUser(UserDto userDto) {
    }
}
