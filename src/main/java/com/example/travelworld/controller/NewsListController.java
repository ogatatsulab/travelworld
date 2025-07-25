package com.example.travelworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.travelworld.service.NewsService;

@Controller
public class NewsListController {
  
  private final NewsService newsService;
  
  public NewsListController( NewsService newsService ) {
    this.newsService = newsService;
  }
  
  @GetMapping( "/" )
  public String findAll( Model model ) {
    model.addAttribute( "newsList", newsService.findAll() );
    return "index";
  }
  
}
