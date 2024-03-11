package com.example.learn.service;

import com.example.learn.entity.Rating;
import com.example.learn.entity.TopUser;


import java.util.List;


public interface TopUserService {

    List<TopUser> getAllSortDesc();

    List<TopUser> getTopUsers(int limit);

    void deleteById(Long id);

   List<TopUser> getAllByMaxRating(Rating rating);
}
