package com.tourist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tourist.entity.Tourist;
import com.tourist.service.TouristService;

@RestController
@RequestMapping("/tourist")
@CrossOrigin("http://localhost:4200")
public class TouristController {
	@Autowired
	private TouristService service;
	
	@GetMapping("/")
	public List<Tourist>getAllTourist(){
		return service.getAllTourist();
	}
	@PostMapping("/add")
	public Tourist saveTourist(@RequestBody Tourist tourist) {
		return service.saveTourist(tourist);
	}
	public Object findById(int i) {
		// TODO Auto-generated method stub
		return service.findById(i);
	}

}
