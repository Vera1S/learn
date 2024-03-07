package com.example.learn.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO {

    private Long id;


    private String name;


    private String email;


    private String rating;
}
