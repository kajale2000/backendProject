package com.service;
import com.dao.InternRepository;
import com.model.Interns;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InternServiceImpl implements InternService {

    private final InternRepository internRepository;

    @Autowired
    public InternServiceImpl(InternRepository internRepository) {
        this.internRepository = internRepository;
    }

    @Override
    public List<Interns> getAllInterns() {
        return internRepository.findAll();
    }

    @Override
    public Interns getInternById(Long id) {
        return internRepository.findById(id).orElse(null);
    }

    @Override
    public Interns createIntern(Interns intern) {
        return internRepository.save(intern);
    }

    @Override
    public Interns updateIntern(Long id, Interns intern) {
        Interns existingIntern = internRepository.findById(id).orElse(null);
        if (existingIntern != null) {
            existingIntern.setFirstName(intern.getFirstName());
            existingIntern.setLastName(intern.getLastName());
            existingIntern.setEmail(intern.getEmail());
            existingIntern.setPhoneNumber(intern.getPhoneNumber());
            existingIntern.setMarital_status(intern.getMarital_status());
            existingIntern.setQualification(intern.getQualification());
            existingIntern.setLocation(intern.getLocation());
           
            return internRepository.save(existingIntern);
        }
        return null;
    }

    @Override
    public boolean deleteIntern(Long id) {
        Interns existingIntern = internRepository.findById(id).orElse(null);
        if (existingIntern != null) {
            internRepository.delete(existingIntern);
            return true;
        }
        return false;
    }

	@Override
	public Interns updateInterns(Interns intern1) {
		Interns existintern=internRepository.findById(intern1.getId()).orElse(null);
		existintern.setLocation(intern1.getLocation());
		return internRepository.save(existintern);
		 
	}
}
