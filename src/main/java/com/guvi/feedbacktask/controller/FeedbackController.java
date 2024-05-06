package com.guvi.feedbacktask.controller;


import com.guvi.feedbacktask.entity.Feedback;
import com.guvi.feedbacktask.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;


    @GetMapping("/index")
    public String index() {

        return "index";

    }

    @PostMapping("/message")
    public String addFeedback(@ModelAttribute Feedback feedback) {
        feedbackService.savefeed(feedback);
        return "redirect:/index";
    }

    @GetMapping("/feedbacks")

    public String showFeedbacks(Model model) {
        List<Feedback> feedbacks = feedbackService.findAll();
        model.addAttribute("feedbacks", feedbacks);

        return "feedbacks";
    }








}
