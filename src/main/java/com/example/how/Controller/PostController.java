package com.example.how.Controller;

import com.example.how.Model.Posts;
import com.example.how.Service.PostService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/Posts")
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping("/userId")
    public Map<String, Integer> alluserDetails()
    {
        return postService.userId();
    }

    @GetMapping("/ChangeData")
    public List<Posts> changedData(@RequestBody Posts posts)
    {
        return postService.changeData(posts);
    }

}
