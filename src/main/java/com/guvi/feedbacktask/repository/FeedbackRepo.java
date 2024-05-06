package com.guvi.feedbacktask.repository;


import com.guvi.feedbacktask.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, Integer> {


    List<Feedback> findByBookName(String bookName);







}
