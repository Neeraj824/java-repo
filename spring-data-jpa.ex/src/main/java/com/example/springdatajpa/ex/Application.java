package com.example.springdatajpa.ex;

import com.example.springdatajpa.ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);


//		s1.setRollNo(101);
//		s1.setName("Neeraj");
//		s1.setMarks(430);

//		s2.setRollNo(102);
//		s2.setName("Pankaj");
//		s2.setMarks(490);

//		s3.setRollNo(103);
//		s3.setName("Rakesh");
//		s3.setMarks(420);
//		repo.save(s3);

		List<Student> list = repo.findAll();
		System.out.println(list.toString());
		System.out.println(repo.findById(102));
		System.out.println(repo.findByName("Neeraj"));

	}

}
