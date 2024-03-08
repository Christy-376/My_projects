package com.careerseekers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerseekers.entity.Candidate;
import com.careerseekers.repo.CareerRepository;

@RestController
public class CareerseekersController {
	@Autowired
	CareerRepository careerRepo;
	
	@PostMapping("/careerSeeker")
	public Candidate registerCandidate(@RequestBody Candidate candidate) {
		return careerRepo.save(candidate);
	
	}

}
