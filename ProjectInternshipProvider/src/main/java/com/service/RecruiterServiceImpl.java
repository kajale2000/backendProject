package com.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.RecruiterRepository;
import com.model.Recruiter;

import java.util.List;

@Service
public class RecruiterServiceImpl implements RecruiterService {

    private final RecruiterRepository recruiterRepository;

    @Autowired
    public RecruiterServiceImpl(RecruiterRepository recruiterRepository) {
        this.recruiterRepository = recruiterRepository;
    }

    @Override
    public List<Recruiter> getAllRecruiters() {
        return recruiterRepository.findAll();
    }

    @Override
    public Recruiter getRecruiterById(Long rec_id) {
        return recruiterRepository.findById(rec_id).orElse(null);
    }

    @Override
    public Recruiter createRecruiter(Recruiter recruiter) {
        return recruiterRepository.save(recruiter);
    }

    @Override
    public Recruiter updateRecruiter( Recruiter recruit) {
        Recruiter existingRecruiter = recruiterRepository.findById(recruit.getRec_id()).orElse(null);
        if (existingRecruiter != null) {
            existingRecruiter.setRecName(recruit.getRecName());
           
            existingRecruiter.setEmail(recruit.getEmail());
            
            existingRecruiter.setCompany(recruit.getCompany());
            
            return recruiterRepository.save(existingRecruiter);
        }
        return null;
    }

    @Override
    public boolean deleteRecruiter(Long rec_id) {
        Recruiter existingRecruiter = recruiterRepository.findById(rec_id).orElse(null);
        if (existingRecruiter != null) {
            recruiterRepository.delete(existingRecruiter);
            return true;
        }
        return false;
    }
}
