package com.example.how.Service;

import com.example.how.Model.Posts;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.client.RestTemplate;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class PostServiceTest {
    @Mock PostService postService;
    @Mock
    RestTemplate restTemplate;

    @Test
    void userId() {
        Posts posts=new Posts();
        Mockito.when(restTemplate.getForObject("http://jsonplaceholder.typicode.com/posts",Posts.class)).thenReturn(posts);
        restTemplate.getForObject("http://jsonplaceholder.typicode.com/posts",Posts.class);
    }

    @Test
    void unique() {
    }

    @Test
    void changeData() {
    }
}