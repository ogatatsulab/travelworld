package com.example.travelworld.entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class News implements Serializable {
  
  @Id
  @GeneratedValue( strategy = GenerationType.IDENTITY )
  private int id;
  private Date newsDate;
  private String newsText;
}
