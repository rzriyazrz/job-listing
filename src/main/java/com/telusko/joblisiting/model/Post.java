package com.telusko.joblisiting.model;

import jdk.jfr.DataAmount;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;


@Document(collection = "JobPost")
@Data
public class Post {

    private String Profile;
    private String desc;
    private int exp;
    private String techs[];

    public Post() {
    }

    @Override
    public String toString() {
        return "Post{" +
                "Profile='" + Profile + '\'' +
                ", desc='" + desc + '\'' +
                ", exp=" + exp +
                ", techs=" + Arrays.toString(techs) +
                '}';
    }







}
