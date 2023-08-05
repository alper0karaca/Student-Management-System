package dev.alperkaraca.sms.service.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.alperkaraca.sms.entity.Student;
import dev.alperkaraca.sms.repository.StudentRepository;
import dev.alperkaraca.sms.service.abstracts.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	// @Autowired
	private StudentRepository studentRepository;
	
	// dependency injection 
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		
		
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		
		
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		
		
		return studentRepository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		
		
		return studentRepository.save(student);
	}


	@Override
	public void deleteStudentById(Long id) {
		
		studentRepository.deleteById(id);
		
	}


}
