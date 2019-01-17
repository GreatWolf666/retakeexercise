package com.greenfoxacademy.retakeexercise.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Attraction {


  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  private String city;
  private int price;
  private float longitude;
  private float latitude;
  private String category;
  private int duration;
  private float recommendedAge;

  public Attraction() {

  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public float getLongitude() {
    return longitude;
  }

  public void setLongitude(float longitude) {
    this.longitude = longitude;
  }

  public float getLatitude() {
    return latitude;
  }

  public void setLatitude(float latitude) {
    this.latitude = latitude;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public double getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public float getRecommendedAge() {
    return recommendedAge;
  }

  public void setRecommendedAge(float recommendedAge) {
    this.recommendedAge = recommendedAge;
  }

}
