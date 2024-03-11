package com.example.learn.DTO;


import com.example.learn.entity.Rating;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO {

    private Long id;


    private String name;


    private String email;


    private Rating rating;
}
