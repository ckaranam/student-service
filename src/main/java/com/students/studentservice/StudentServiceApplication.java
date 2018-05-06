package com.students.studentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = StudentRepository.class)
public class StudentServiceApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("_________________________________________________________");
		/*
		studentRepository.save(new Student(1,"sa","hjh","11/2/1990","cse"));

		studentRepository.save(new Student(2,"sfdfdfa","hjh","11/2/1990","cse"));
		studentRepository.save(new Student(3,"sa","hjh","11/2/1990","eee"));
		studentRepository.save(new Student(4,"hjgfhg","hjh","11/2/1990","ece"));
	*/
	}
}
