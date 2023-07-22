package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.InternshipRepository;
import com.model.Internship;

import java.util.List;

@Service
public class InternshipImpl implements InternshipService {

    private final InternshipRepository internshipRepository;

    @Autowired
    public InternshipImpl(InternshipRepository internshipRepository) {
        this.internshipRepository = internshipRepository;
    }

    @Override
    public List<Internship> getAllInternships() {
        return internshipRepository.findAll();
    }

    @Override
    public Internship getInternshipById(Long id) {
        return internshipRepository.findById(id).orElse(null);
    }

    @Override
    public Internship createInternship(Internship internship) {
        return internshipRepository.save(internship);
    }

    @Override
    public Internship updateInternship(Long id, Internship internship) {
        Internship existingInternship = internshipRepository.findById(id).orElse(null);
        if (existingInternship != null) {
            existingInternship.setCompany_name(internship.getCompany_name());
            existingInternship.setDomain(internship.getDomain());
            existingInternship.setDuration(internship.getDuration());
            existingInternship.setLocation(internship.getLocation());
            return internshipRepository.save(existingInternship);
        }
        return null;
    }

    @Override
    public boolean deleteInternship(Long id) {
        Internship existingInternship = internshipRepository.findById(id).orElse(null);
        if (existingInternship != null) {
            internshipRepository.delete(existingInternship);
            return true;
        }
        return false;
    }
}
