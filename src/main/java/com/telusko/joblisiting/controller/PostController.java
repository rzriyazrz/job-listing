package com.telusko.joblisiting.controller;

import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.telusko.joblisiting.repository.PostRepository;
import com.telusko.joblisiting.model.Post;
import com.telusko.joblisiting.repository.SearchRepository;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;

    @ApiIgnore
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }
    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return repo.findAll();
    }
    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){

        return srepo.findByText(text);
    }
    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){
        return repo.save(post);
    }

}
