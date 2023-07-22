package com.service;

import java.util.List;


import com.model.Interns;


public interface InternService {
		List<Interns> getAllInterns();
	    Interns getInternById(Long id);
	    Interns createIntern(Interns intern);
	    Interns updateIntern(Long id, Interns intern);
	    boolean deleteIntern(Long id);
	Interns updateInterns(Interns intern1);
}
