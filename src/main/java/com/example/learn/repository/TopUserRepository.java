package com.example.learn.repository;

import com.example.learn.entity.TopUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopUserRepository extends JpaRepository<TopUser, Long> {

  List<TopUser> findTopNByOrderByRatingDesc(int limit);

    // @Query(value = "SELECT * FROM TopUser ORDER BY T")

}
