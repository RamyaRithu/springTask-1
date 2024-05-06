package com.guvi.feedbacktask.service;


import com.guvi.feedbacktask.entity.Feedback;
import com.guvi.feedbacktask.repository.FeedbackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepo feedbackRepo;

    public Feedback savefeed(Feedback feedback) {
        return feedbackRepo.save(feedback);
    }
    public List<Feedback> findAll() {
        return feedbackRepo.findAll();

    }
    public Feedback findById(int id) {
        return feedbackRepo.findById(id).get();


    }

    public List<Feedback> findByBookName(String bookName) {
        return feedbackRepo.findByBookName(bookName);
    }


}
