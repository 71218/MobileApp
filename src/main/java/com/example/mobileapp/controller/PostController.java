package com.example.mobileapp.controller;

import com.example.mobileapp.model.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class PostController {
    @GetMapping("/posts")
    public List<Post> getPosts(){
        throw new IllegalArgumentException("Not implement yet!");
    }

    @GetMapping("/posts/{id}")
    public Post getSinglePost(@PathVariable String id) {
        throw new IllegalArgumentException("Not implement yet!");
    }
}
