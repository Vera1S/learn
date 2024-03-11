package com.example.learn.service.impl;

import com.example.learn.entity.User;
import com.example.learn.repository.RatingRepository;
import com.example.learn.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class DropRatingServiceImpl {

    private final RatingRepository ratingRepository;
    private final UserService userService;


    @Scheduled(cron = "0 0 */24 * * *")
    public void deleteRatingUsers(){

        // Метод для удаления всех пользователей кроме первых 10
        public void keepFirstTenRatingUsers() {

            int ratingUsers = 0;
            if (ratingUsers > 10) {
                ratingUsers.subList(10, ratingUsers.size()).clear();
            }
        }
    }
}
