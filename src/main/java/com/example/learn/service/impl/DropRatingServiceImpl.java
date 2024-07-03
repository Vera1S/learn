package com.example.learn.service.impl;

import com.example.learn.entity.TopUser;
import com.example.learn.entity.User;
import com.example.learn.repository.RatingRepository;
import com.example.learn.repository.TopUserRepository;
import com.example.learn.service.TopUserService;
import com.example.learn.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class DropRatingServiceImpl {

    private final RatingRepository ratingRepository;
    private final UserService userService;
    private final TopUserService topUserService;
    private final TopUserRepository topUserRepository;


    @Scheduled(cron = "0 0 */24 * * *")
    public void deleteRatingUsers(){

        // Метод для удаления всех пользователей кроме первых 10

    }

    //TODO: исправить логику
    public void keepFirstTenRatingUsers() {

        List<TopUser> topUsers = topUserService.getAllSortDesc();
        if (topUsers.size() > 10) {
            List<TopUser> usersToDelete = topUsers.subList(10, topUsers.size());
            ratingUsers.subList(10, ratingUsers.size()).clear();
        }
    }
}

