package com.example.how.Controller;

import com.example.how.Model.Posts;
import com.example.how.Service.PostService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class PostControllerTest {
    @InjectMocks
    PostController postController;
    @Mock
    PostService postService;

    @Test
    void alluserDetails() {
        Posts post=new Posts();
        List<Posts> list = new ArrayList<>(List.of(post));
        Posts user1=new Posts();
        user1.setId(1);
        user1.setUserId(1L);
        user1.setTitle("1800 Flowers");
        user1.setBody("1800 Flowers");
        list.add(user1);
        assertEquals(1L,list.get(1).getUserId());
        assertEquals(1,list.get(1).getId());
        assertEquals("1800 Flowers",list.get(1).getTitle());
        assertEquals("1800 Flowers",list.get(1).getBody());
        Map<Integer, List<Posts>> map = new HashMap<>();
        for (Posts posts : list) {
            //map.computeIfAbsent(Math.toIntExact(posts.getUserId()), key -> new ArrayList<>()).add(posts);
        }
        Map<String, Integer> map1 = new HashMap<>();
        map.forEach((k, v) -> {map1.put("userId " + k+" : ", v.size());});
        assertNotNull(map1);
        Mockito.when(postController.alluserDetails()).thenReturn(map1);
        assertNotNull(postService.userId());
    }



    @Test
    void changedData() {

            Posts user=new Posts();
            List<Posts> list = new ArrayList<>(List.of(user));
            Posts post4=new Posts();
            post4.setId(1);
            post4.setUserId(3L);
            post4.setTitle("1800 Flowers");
            post4.setBody("1800 Flowers");
            list.add(post4);
            assertEquals(3,list.get(1).getUserId());
            assertEquals(1L,list.get(1).getId());
            assertEquals("1800 Flowers",list.get(1).getTitle());
            assertEquals("1800 Flowers",list.get(1).getBody());
            Mockito.when(postService.changeData(Mockito.any())).thenReturn(list);
            postController.changedData(post4);
    }
}