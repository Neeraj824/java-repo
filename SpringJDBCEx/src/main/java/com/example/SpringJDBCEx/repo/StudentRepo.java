package com.example.SpringJDBCEx.repo;

import com.example.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {
//        System.out.println("Added in Student DB");
        String sql = "insert into student (rollNo, name, marks) values (? , ?, ?)";
        int rows = jdbc.update(sql,s.getRollNo(),s.getName(),s.getMarks());
        System.out.println(rows +" Effected");
    }

    public List<Student> findAll() {
        String sql = "Select * from student";
        return  jdbc.query(sql,(rs,  rowNum) -> {
            Student st  =  new Student();
            st.setRollNo(rs.getInt("rollNo"));
            st.setName(rs.getString("name"));
            st.setMarks(rs.getInt("marks"));
            return st;
        });

    }



}
