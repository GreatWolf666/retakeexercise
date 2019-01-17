package com.greenfoxacademy.retakeexercise.repository;

import com.greenfoxacademy.retakeexercise.model.Attraction;
import org.springframework.data.repository.CrudRepository;

public interface AttractionRepository extends CrudRepository<Attraction, Long> {
}
