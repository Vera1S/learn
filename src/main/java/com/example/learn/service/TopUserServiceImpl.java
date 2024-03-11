package com.example.learn.service;

import com.example.learn.entity.Rating;
import com.example.learn.entity.TopUser;
import com.example.learn.repository.TopUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TopUserServiceImpl implements TopUserService{

    private final TopUserRepository topUserRepository;
    private final RatingService ratingService;


    @Override
    public List<TopUser> getAllSortDesc() {
        List<TopUser> topUsers = topUserRepository.findAll(Sort.Direction.DESC, Integer.valueOf("rating"));
        if (topUsers.isEmpty()){

        }
        return topUserRepository.findAll();
    }
    public List<TopUser> getTopUsers(int limit) {
        return topUserRepository.findTopNByOrderByRatingDesc(limit);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<TopUser> getAllByMaxRating(Rating rating) {
        return null;
    }
}
