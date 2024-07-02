package com.example.Quiz.App.dao;

import com.example.Quiz.App.model.Question;
import com.example.Quiz.App.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizDao extends JpaRepository<Quiz,Integer> {

}
