package com.example.TeacherApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.example.TeacherApp.Entity.Student;
import com.example.TeacherApp.model.custom.IStudentCount;
import com.example.TeacherApp.service.StudentService;

@RestController
@RequestMapping("/myapi/")
public class StudentController {
	
	private final StudentService studentService;
	
	@Autowired
	public StudentController(StudentService stService) {
		this.studentService = stService;
	}
	
	//Insert a new student
	@PostMapping("/student")
	public ResponseEntity<Student> saveStudent(@Validated @RequestBody Student student){
		Student newStudent = studentService.saveStudent(student);
		return ResponseEntity.ok(newStudent);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException(Exception ex) {
	    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudent(){
		return studentService.getAllStudent();
	}
	
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
		Optional<Student> student = studentService.getStudentById(id);
		return student.map(ResponseEntity::ok).orElseGet(()-> ResponseEntity.notFound().build());
	}
	
	@PutMapping("/students/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student){
		Student updatedStudent = studentService.updateStudent(id, student);
		return ResponseEntity.ok(updatedStudent);
	}
	
	@DeleteMapping("/students/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Long id){
		studentService.deleteProduct(id);
		return ResponseEntity.ok("Product deleted successfully.");
	}
	
	@GetMapping("/statistic")
	public IStudentCount getStudentCount(){
		return studentService.getStudentCount();
	}
}
