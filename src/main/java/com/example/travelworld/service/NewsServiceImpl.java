package com.example.travelworld.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.travelworld.entity.News;
import com.example.travelworld.repository.NewsRepository;

@Service
public class NewsServiceImpl implements NewsService {
  
  private final NewsRepository newsRepository;
  
  public NewsServiceImpl( NewsRepository newsRepository ) {
    this.newsRepository = newsRepository;
  }

  @Override
  public List<News> findAll() {
    return newsRepository.findAll();
  }

}
