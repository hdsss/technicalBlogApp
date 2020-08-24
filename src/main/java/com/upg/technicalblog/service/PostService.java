package com.upg.technicalblog.service;

import com.upg.technicalblog.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    public PostService() {
        System.out.println("*** PostService ***");
    }

    public ArrayList<Post> getAllPosts(){
        ArrayList<Post> posts = new ArrayList<>();
        Post post1 = new Post();
        post1.setTitle("post1");
        post1.setBody("this is body of post1.");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("post2");
        post2.setBody("this is body of post2.");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("post3");
        post3.setBody("this is body of post3.");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        return posts;
    }

    public ArrayList<Post> getOnePost(){
        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("This is your Post");
        post1.setBody("This is your Post. It has some valid content");
        post1.setDate(new Date());
        posts.add(post1);

        return posts;
    }
}

