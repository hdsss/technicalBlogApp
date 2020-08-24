package com.upg.technicalblog.controller;

import com.upg.technicalblog.model.Post;
import com.upg.technicalblog.model.User;
import com.upg.technicalblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class UserController {
    @Autowired
    private PostService postService;

    @RequestMapping("users/login")
    public String login(){
        return "users/login";
    }

    @RequestMapping("users/register")
    public String register(){
        return "users/register";
    }

    @RequestMapping(value="users/logout", method = RequestMethod.POST)
    public String logout(Model model){
        ArrayList<Post> posts = postService.getAllPosts();
        model.addAttribute("posts", posts);
        return "blogindex";
    }

    @RequestMapping(value="users/login", method = RequestMethod.POST)
    public String loginuser(User user){
        return "redirect:/posts";
    }

}
