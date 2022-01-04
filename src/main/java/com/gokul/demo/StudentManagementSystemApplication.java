package com.gokul.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gokul.demo.entity.Student;
import com.gokul.demo.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
   @Autowired
   private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
	/*   Student student1=new Student("gokul","viper","gokul@gamil.com");
	   studentRepository.save(student1);
	   
	   Student student2=new Student("arun","kumar","arun@gamil.com");
	   studentRepository.save(student2);
	   
	   Student student3=new Student("gokul","dexter","dexter@gamil.com");
	   studentRepository.save(student3);*/
		
	}

}
