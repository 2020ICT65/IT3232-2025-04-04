package me.chamodi.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.chamodi.spring.model.student;

@RestController
@RequestMapping("/Stu")
public class StudentController extends CRUDController<String, student> {
	
	student Chamodi = new student("2020ICT65","Chamodi",23,"IT",3.72);
	student Neranjana = new student("2020ICT97","Neranjana",24,"IT",3.40);
	student Piyumal = new student("2020ICT24","Piyumal",26,"IT",2.86);
	
	public StudentController(){
		getMap().put(Chamodi.getRegNo(), Chamodi);
		getMap().put(Neranjana.getRegNo(), Neranjana);
		getMap().put(Piyumal.getRegNo(), Piyumal);
	}

}