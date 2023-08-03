package com.telusko.joblisiting.repository;

import com.telusko.joblisiting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {


}
