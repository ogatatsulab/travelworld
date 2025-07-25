package com.example.travelworld.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.travelworld.entity.News;

public interface NewsRepository extends JpaRepository<News, Integer> {
}

