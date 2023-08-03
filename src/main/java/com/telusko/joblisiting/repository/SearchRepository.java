package com.telusko.joblisiting.repository;

import com.telusko.joblisiting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
