package com.example.travelworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.example.travelworld.entity.News;
import com.example.travelworld.form.NewsForm;
import com.example.travelworld.service.NewsService;

@Controller
@SessionAttributes( "newsForm" )
public class NewsCreateController {
  
  private final NewsService newsService;
  
  public NewsCreateController( NewsService newsService ) {
    this.newsService = newsService;
  }
  
  @GetMapping( "/create" )
  public String create( Model model ) {
    model.addAttribute( "newsForm", new NewsForm() );
    return "newsCreate";
  }
  
  @PostMapping( "/create/confirm" )
  public String confirm( NewsForm newsForm ) {
    return "newsConfirm";
  }
  
  @PostMapping( "/create/complete" )
  public String complete( NewsForm newsForm, SessionStatus sessionStatus ) {
    News news = new News( 0, newsForm.getNewsDate(), newsForm.getNewsText() );
    newsService.saveAndFlush( news );
    sessionStatus.setComplete();
    return "newsComplete";
  }

}
