package com.greenfoxacademy.retakeexercise.controller;

import com.greenfoxacademy.retakeexercise.model.Attraction;
import com.greenfoxacademy.retakeexercise.service.AttractionServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

  AttractionServiceImpl attractionService;

  @GetMapping("/")
  public String mainPage(Model model) {
    model.addAttribute("allAttractions", attractionService.listAttractions());
    return "index";
  }

  @PostMapping("/add")
  public String addAttraction(Model model){
    model.addAttribute("addAttraction", attractionService.addAttraction());
    return "redirect:/";
  }

  @GetMapping("/edit/{id}")
  public String editAttraction(){
    return "edit";
  }

  @GetMapping("/budget")
  public String budgetListing(){
    return "budget";
  }
}
