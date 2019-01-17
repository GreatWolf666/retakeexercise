package com.greenfoxacademy.retakeexercise.service;

import com.greenfoxacademy.retakeexercise.model.Attraction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AttractionService {

  List<Attraction> listAttractions();
  Attraction getAttractionById(long id);
  void addAttraction(Attraction attraction);
  void editAttraction(Attraction attraction);

}
