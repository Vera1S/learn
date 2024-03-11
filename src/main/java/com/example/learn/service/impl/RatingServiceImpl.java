package com.example.learn.service.impl;

import com.example.learn.DTO.RatingDTO;
import com.example.learn.entity.Rating;
import com.example.learn.service.RatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RatingServiceImpl implements RatingService {




    @Override
    public Optional<RatingDTO> findById(Long id) {
        return Optional.empty();
    }
}
