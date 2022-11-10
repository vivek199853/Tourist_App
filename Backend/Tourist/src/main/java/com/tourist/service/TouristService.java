package com.tourist.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tourist.entity.Tourist;
import com.tourist.repository.TouristRepository;

@Service
public class TouristService {
	@Autowired
	private TouristRepository repo;


	public Tourist saveTourist(Tourist tourist) {
		// TODO Auto-generated method stub
		return repo.save(tourist);
	}


	public List<Tourist> getAllTourist() {
		// TODO Auto-generated method stub
		
		return repo.findAll();
	}


	public Object findById(int i) {
		// TODO Auto-generated method stub
		return repo.findById(i);
	}

}
