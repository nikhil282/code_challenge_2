package com.example.how.Service;

import com.example.how.Model.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class PostService {

    RestTemplate restTemplate;
    @Autowired
    public PostService(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate=restTemplateBuilder.build();
    }
    public Map<String,Integer> userId()
    {
        try
        {
            Posts[] user = restTemplate.getForObject("http://jsonplaceholder.typicode.com/posts", Posts[].class);
            List<Posts> list = new ArrayList<>(Arrays.asList(user));
            return unique(list);
        }
        catch (RestClientException e)
        {
            throw new RuntimeException("Got a Run Time Exception");
        }
    }

    public Map<String,Integer> unique(List<Posts> list){
        try
        {
            Map<Integer, List<Posts>> map = new HashMap<>();
            for (Posts posts : list) {
                map.computeIfAbsent(Math.toIntExact(posts.getUserId()), key -> new ArrayList<>()).add(posts);
            }
            Map<String, Integer> map1 = new HashMap<>();
            map.forEach((k, v) -> {
                map1.put("userId " + k, v.size());
            });
            return map1;
        }
        catch (Exception e)
        {
            throw new RuntimeException("Got a Runtime Exception");
        }

    }
    public List<Posts> changeData(Posts posts) {
        try
        {
            Posts[] user = restTemplate.getForObject("http://jsonplaceholder.typicode.com/posts", Posts[].class);
            List<Posts> list = new ArrayList<>(Arrays.asList((user)));
            Posts post4 = new Posts();
            post4.setUserId(1L);
            post4.setId(4);
            post4.setTitle("1800Flowers");
            post4.setBody("1800Flowers");

            list.set(3,post4);
            list.removeIf(posts1 -> post4.equals(post4.getUserId()));
            return list;
        }
        catch (NullPointerException e)
        {
            throw new NullPointerException("Got a NullPointer Exception");
        }
    }

}




