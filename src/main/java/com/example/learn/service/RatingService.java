package com.example.learn.service;

import com.example.learn.DTO.RatingDTO;
import com.example.learn.entity.Rating;

import java.util.Optional;

public interface RatingService {

   Optional<RatingDTO> findById(Long id);
}
