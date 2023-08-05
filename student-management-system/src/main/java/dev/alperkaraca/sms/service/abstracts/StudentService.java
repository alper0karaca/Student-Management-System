package dev.alperkaraca.sms.service.abstracts;

import java.util.List;

import dev.alperkaraca.sms.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
	
	
	

}
