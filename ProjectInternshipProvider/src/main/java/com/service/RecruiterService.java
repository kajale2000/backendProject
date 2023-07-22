package com.service;

import java.util.List;

import com.model.Recruiter;

public interface RecruiterService {
    List<Recruiter> getAllRecruiters();
    Recruiter getRecruiterById(Long rec_id);
    Recruiter createRecruiter(Recruiter recruiter);
    Recruiter updateRecruiter( Recruiter recruit);
    boolean deleteRecruiter(Long rec_id);
}
