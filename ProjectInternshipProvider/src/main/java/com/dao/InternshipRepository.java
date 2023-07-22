package com.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Internship;

@Repository
public interface InternshipRepository extends JpaRepository<Internship,Integer>{

	Optional<Internship> findById(Long id);

}
