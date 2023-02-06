package com.example.chucknorrisquotes.controller;

import com.example.chucknorrisquotes.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/")
    public String getJoke() {
        return jokeService.getJoke();
    }
}
