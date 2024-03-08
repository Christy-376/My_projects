package com.careerseekers.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.careerseekers.entity.Candidate;


public interface CareerRepository extends JpaRepository<Candidate,Long>{

}
