package com.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Interns;

public interface InternRepository extends JpaRepository<Interns,Long>{

	Optional<Interns> findById(Long id);
	
	
}
