package me.chamodi.spring.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.chamodi.spring.model.student;

@RestController
@RequestMapping("/Stu")
public class StudentController {
	
	student Chamodi = new student("2020ICT65","Chamodi",23,"IT",3.72);
	student Neranjana = new student("2020ICT97","Neranjana",24,"IT",3.40);
	student Piyumal = new student("2020ICT24","Piyumal",26,"IT",2.86);
	
	//student[] students = {Chamodi, Neranjana, Piyumal};
	private Map<String, student> mstudents = new HashMap<String, student>();

	public StudentController(){
		mstudents.put(Chamodi.getRegNo(),Chamodi);
		mstudents.put(Neranjana.getRegNo(),Neranjana);
		mstudents.put(Piyumal.getRegNo(),Piyumal);
	}

	@GetMapping("/Chamodi")
	public student Chamodi() {
		return Chamodi;
	}
	
	@GetMapping("/students/{id}")
	public student getById(@PathVariable("id") String regno) {
		// return null;
		return mstudents.get(regno);
	}

	@PostMapping("/add")
	public String addStudent(@RequestBody student student){
		mstudents.put(student.getRegNo(), student);
		return "New Student Added";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("id") String regno){
		if(mstudents.get(regno) != null){
			mstudents.remove(regno);
			return "The student removed";
		}
		return "404 Could'nt find the student";
	}
	@PutMapping("/update/{id}")
	public String updateStudent(@PathVariable("id") String regno, @RequestBody student student){
		if(mstudents.get(regno) != null){
			mstudents.put(student.getRegNo(), student);
			return "The student details are updated";
		}
		return "404 Could'nt find the student";
	}
}