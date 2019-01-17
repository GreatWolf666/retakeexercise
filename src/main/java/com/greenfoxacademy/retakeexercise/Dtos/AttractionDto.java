package com.greenfoxacademy.retakeexercise.Dtos;


public class AttractionDto {

  private long id;
  private String name;
  private String city;
  private int price;
  private double longitude;
  private double latitude;
  private String category;
  private double duration;
  private double recommendedAge;

  public AttractionDto(long id, String name, String city,
                       int price, double longitude,
                       double latitude, String category,
                       double duration, double recommendedAge)
  {
    this.id = id;
    this.name = name;
    this.city = city;
    this.price = price;
    this.longitude = longitude;
    this.latitude = latitude;
    this.category = category;
    this.duration = duration;
    this.recommendedAge = recommendedAge;
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

  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  public double getLatitude() {
    return latitude;
  }

  public void setLatitude(double latitude) {
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

  public void setDuration(double duration) {
    this.duration = duration;
  }

  public double getRecommendedAge() {
    return recommendedAge;
  }

  public void setRecommendedAge(double recommendedAge) {
    this.recommendedAge = recommendedAge;
  }
}
