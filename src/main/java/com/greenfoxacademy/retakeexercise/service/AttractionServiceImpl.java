package com.greenfoxacademy.retakeexercise.service;


import com.greenfoxacademy.retakeexercise.model.Attraction;
import com.greenfoxacademy.retakeexercise.repository.AttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AttractionServiceImpl implements AttractionService {

  private AttractionRepository repository;

  @Autowired
  AttractionServiceImpl(AttractionRepository repository){
    this.repository = repository;
  }


  @Override
  public List<Attraction> listAttractions() {
    List<Attraction> attractionList = new ArrayList<>();
    repository.findAll().forEach(attractionList::add);
    return attractionList;
  }

  @Override
  public Attraction getAttractionById(long id) {
    return repository.findById(id).orElse(null);
  }

  @Override
  public void addAttraction(Attraction attraction) {
    repository.save(attraction);

  }

  @Override
  public void editAttraction(Attraction attraction) {
    repository.save(attraction);
  }
}
