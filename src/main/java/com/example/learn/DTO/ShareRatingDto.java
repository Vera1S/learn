package com.example.learn.DTO;

import lombok.Data;

@Data
public class ShareRatingDto {

    private Long fromId;

    private Long toId;

    private Integer countOfRating;
}
