package com.example.TeacherApp.repository;

import org.springframework.stereotype.Repository;
import com.example.TeacherApp.Entity.Student;
import com.example.TeacherApp.model.custom.IStudentCount;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	@Query(value = "Select count(name) as totalCount, "
			+ "SUM(case when gender='Male' then 1 else 0 end) as countMale, "
			+ "SUM(CASE WHEN gender='Female' Then 1 else 0 end) as countFemale, "
			+ "SUM(CASE WHEN race='Chinese' Then 1 else 0 end) as countChinese, "
			+ "SUM(CASE WHEN race='Malay' Then 1 else 0 end) as countMalay, "
			+ "SUM(CASE WHEN race='India' Then 1 else 0 end) as countIndia, "
			+ "SUM(CASE WHEN religion='Islam' Then 1 else 0 end) as countIslam, "
			+ "SUM(CASE WHEN religion='Hindu' Then 1 else 0 end) as countHindu, "
			+ "SUM(CASE WHEN religion='Christian' Then 1 else 0 end) as countChristian, "
			+ "SUM(CASE WHEN religion='Buddha' Then 1 else 0 end) as countBuddha "
			+ "FROM Student")
	IStudentCount getStudentCount();
}
