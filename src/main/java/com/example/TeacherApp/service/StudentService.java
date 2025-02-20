package com.example.TeacherApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.TeacherApp.Entity.Student;
import com.example.TeacherApp.model.custom.IStudentCount;
import com.example.TeacherApp.repository.StudentRepository;

@Service
public class StudentService {
	private final StudentRepository studentRepository;
	
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	//Save student
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	
	//Get all student
	public List<Student> getAllStudent(){
		return studentRepository.findAll();
	}
	
	// get student by Id
	public Optional<Student>getStudentById(Long id){
		return studentRepository.findById(id);
	}
	
	// update student
	public Student updateStudent(Long id, Student updatedStudent) {
		Optional<Student> existingStudent = studentRepository.findById(id);
		if(existingStudent.isPresent()) {
			Student student = existingStudent.get();
			student.setName(updatedStudent.getName());
			student.setIcNumber(updatedStudent.getIcNumber());
			student.setGender(updatedStudent.getGender());
			student.setRace(updatedStudent.getRace());
			student.setReligion(updatedStudent.getReligion());
			
			return studentRepository.save(student);
		}else {
			throw new RuntimeException("Student not found");
		} 
	}
	
	//delete student
	public void deleteProduct(Long id) {
		studentRepository.deleteById(id);
	}
	
	public IStudentCount getStudentCount() {
		return studentRepository.getStudentCount();
	}
	
}
