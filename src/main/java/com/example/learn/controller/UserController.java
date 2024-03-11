package com.example.learn.controller;

import com.example.learn.DTO.ShareRatingDto;
import com.example.learn.DTO.UserDTO;
import com.example.learn.entity.User;
import com.example.learn.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;


    @GetMapping(value = "/id")
    public UserDTO getById(@PathVariable(value = "id")Long id){
        Optional<User> user = userService.findById(id);
        UserDTO userDTO = new UserDTO(user.get().getId(), user.get().getName(), user.get().getEmail(),
                user.get().getRating());
        return userDTO;

    }
    @GetMapping(value = "/all")
    public ResponseEntity <Collection<UserDTO>> getAllUser(){
        List<User> users = userService.findAll();
        Collection<UserDTO> userDTOS = users.stream()
                .map(i -> new UserDTO(i.getId(), i.getName(), i.getEmail(), i.getRating()))
                .toList();
        return ResponseEntity.ok(userDTOS);
    }
    @DeleteMapping(value = "/delete/{id}")
    public void deleteById(@PathVariable(value = "id")Long id){
        userService.deleteById(id);
    }

    @PutMapping(value = "/update/{id}")
    public void updateBasketById(@PathVariable(value = "id")Long id, @RequestBody User user){
        userService.update(id, user);
    }


}
