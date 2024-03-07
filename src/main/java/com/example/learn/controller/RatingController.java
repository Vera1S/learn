package com.example.learn.controller;

import com.example.learn.DTO.ShareRatingDto;
import com.example.learn.service.RatingService;
import com.example.learn.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RatingController {

    private final RatingService ratingService;

//        @PostMapping(value = "/share-rating")
//    public shareRating(@RequestBody ShareRatingDto shareRatingDto){
//        return UserService.;
//    }
}
