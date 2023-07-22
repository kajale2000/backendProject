package com.service;
import java.util.List;

import com.model.Internship;

public interface InternshipService {
    List<Internship> getAllInternships();
    Internship getInternshipById(Long id);
    Internship createInternship(Internship internship);
    Internship updateInternship(Long id, Internship internship);
    boolean deleteInternship(Long id);
}
