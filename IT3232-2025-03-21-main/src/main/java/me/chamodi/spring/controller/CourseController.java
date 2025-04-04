package me.chamodi.spring.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.chamodi.spring.model.Course;
import me.chamodi.spring.model.student;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/Course")
public class CourseController {
    
    Course IT = new Course("Information Technology","IT","DPS");
    Course AMC = new Course("Applied Mathematics and Computing","AMC","DPS");
    Course ENS = new Course("Environmental Science","ENS","DBS");

    private Map<String, Course> mcourse = new HashMap<String, Course>();

    public CourseController(){
        mcourse.put(IT.getcourseCode(),IT);
        mcourse.put(AMC.getcourseCode(),AMC);
        mcourse.put(ENS.getcourseCode(),ENS);
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable("id") String courseCode) {
        return mcourse.get(courseCode);
    }
    
    @PostMapping("/add")
    public String addCourse(@RequestBody Course course) {
        mcourse.put(course.getcourseCode(), course);
        return "New Course Added";
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteCourse(@PathVariable("id") String courseCode){
        if(mcourse.get(courseCode)!= null){
            mcourse.remove(courseCode);
            return "The course removed";
        }
        return "404 Could'nt find the course";
    }
}
