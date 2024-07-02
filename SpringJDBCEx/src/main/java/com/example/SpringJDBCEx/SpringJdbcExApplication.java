package com.example.SpringJDBCEx;

import com.example.SpringJDBCEx.model.Student;
import com.example.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setRollNo(4);
		s.setName("Neeraj");
		s.setMarks(400);
		System.out.println("Main Class Call");
		StudentService service = context.getBean(StudentService.class);
		service.addstudent(s);

		List<Student> students = service.getStudents();
		System.out.println(students);


	}

}
