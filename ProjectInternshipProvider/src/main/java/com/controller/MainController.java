package com.controller; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.model.Interns;
import com.model.Internship;
import com.model.Recruiter;
import com.service.InternService;
import com.service.InternshipService;
import com.service.RecruiterService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
//@RequestMapping("/api")
public class MainController {

	@Autowired
	private final InternService internService;
	@Autowired
	private final InternshipService internshipService;
	@Autowired
	private final RecruiterService recruiterService;

	
	public MainController(InternService internService, InternshipService internshipService,RecruiterService recruiterService) {
		this.internService = internService;
		this.internshipService = internshipService;
		this.recruiterService = recruiterService;
	}

	
	
	
	// *****************Intern*****************************
	
	@PostMapping("/addintern")
	public ResponseEntity<Interns> createIntern(@RequestBody Interns intern) {
		Interns createdIntern = internService.createIntern(intern);
		return new ResponseEntity<>(createdIntern, HttpStatus.CREATED);
	}
	
	@GetMapping("/interns")
	public ResponseEntity<List<Interns>> getAllInterns() {
		List<Interns> interns = internService.getAllInterns();
		return new ResponseEntity<>(interns, HttpStatus.OK);
	}

	@GetMapping("/interns/{id}")
	public ResponseEntity<Interns> getInternById(@PathVariable("id") Long id) {
		Interns intern = internService.getInternById(id);
		if (intern != null) {
			return new ResponseEntity<>(intern, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/updateintern")
	public Interns updateInterns(@RequestBody Interns intern1) {
		return internService.updateInterns(intern1);
	}

	@PutMapping("/interns/{id}")
	public ResponseEntity<Interns> updateIntern(@PathVariable("id") Long id, @RequestBody Interns intern) {
		Interns updatedIntern = internService.updateIntern(id, intern);
		if (updatedIntern != null) {
			return new ResponseEntity<>(updatedIntern, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/deleteinterns/{id}")
	public ResponseEntity<Void> deleteIntern(@PathVariable("id") Long id) {
		boolean deleted = internService.deleteIntern(id);
		if (deleted) {
		
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	
	
	
	// *********************Internship***************
	@GetMapping("/getinternships")
	public ResponseEntity<List<Internship>> getAllInternships() {
		List<Internship> internships = internshipService.getAllInternships();
		return new ResponseEntity<>(internships, HttpStatus.OK);
	}

	@GetMapping("/internships/{id}")
	public ResponseEntity<Internship> getInternshipById(@PathVariable("id") Long id) {
		Internship internship = internshipService.getInternshipById(id);
		if (internship != null) {
			return new ResponseEntity<>(internship, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/addinternships")
	public ResponseEntity<Internship> createInternship(@RequestBody Internship internship) {
		Internship createdInternship = internshipService.createInternship(internship);
		return new ResponseEntity<>(createdInternship, HttpStatus.CREATED);
	}

	@PutMapping("/internships/{id}")
	public ResponseEntity<Internship> updateInternship(@PathVariable("id") Long id,
			@RequestBody Internship internship) {
		Internship updatedInternship = internshipService.updateInternship(id, internship);
		if (updatedInternship != null) {
			return new ResponseEntity<>(updatedInternship, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/internships/{id}")
	public ResponseEntity<Void> deleteInternship(@PathVariable("id") Long id) {
		boolean deleted = internshipService.deleteInternship(id);
		if (deleted) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	
	
	// ******************Recruiter***************************
	@GetMapping("/recruiters")
	public ResponseEntity<List<Recruiter>> getAllRecruiters() {
		List<Recruiter> recruiters = recruiterService.getAllRecruiters();
		return new ResponseEntity<>(recruiters, HttpStatus.OK);
	}

	@GetMapping("/recruiters/{id}")
	public ResponseEntity<Recruiter> getRecruiterById(@PathVariable("id") Long rec_id) {
		Recruiter recruiter = recruiterService.getRecruiterById(rec_id);
		if (recruiter != null) {
			return new ResponseEntity<>(recruiter, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/addRecruiter")
	public ResponseEntity<Recruiter> createRecruiter(@RequestBody Recruiter recruiter) {
		Recruiter createdRecruiter = recruiterService.createRecruiter(recruiter);
		return new ResponseEntity<>(createdRecruiter, HttpStatus.CREATED);
	}

	@PutMapping("/updaterecruiters")
	public ResponseEntity<Recruiter> updateRecruiter( @RequestBody Recruiter recruit) {
		Recruiter updatedRecruiter = recruiterService.updateRecruiter( recruit);
		if (updatedRecruiter != null) {
			return new ResponseEntity<>(updatedRecruiter, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/recruiters/{id}")
	public ResponseEntity<Void> deleteRecruiter(@PathVariable("id") Long rec_id) {
		boolean deleted = recruiterService.deleteRecruiter(rec_id);
		if (deleted) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
