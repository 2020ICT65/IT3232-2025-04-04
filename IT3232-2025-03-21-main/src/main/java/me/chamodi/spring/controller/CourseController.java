package me.chamodi.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.chamodi.spring.model.Course;

@RestController
@RequestMapping("/Course")

public class CourseController extends CRUDController<String, Course> {

    public CourseController() {
        Course IT = new Course("Information Technology", "IT", "DPS");
        Course AMC = new Course("Applied Mathematics and Computing", "AMC", "DPS");
        Course ENS = new Course("Environmental Science", "ENS", "DBS");

        getMap().put(IT.getcourseCode(), IT);
        getMap().put(AMC.getcourseCode(), AMC);
        getMap().put(ENS.getcourseCode(), ENS);
    }
}