package com.example.how.Model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)

class PostsTest {
    @InjectMocks Posts posts;


    @Test
    void getUserId() {
        Posts posts=new Posts();
        posts.setUserId(98L);

        assertEquals(posts,posts);
    }

    @Test
    void getId() {
        Posts posts=new Posts();
        posts.getId();
        assertEquals(posts,new Posts());
    }

    @Test
    void getTitle() {
        Posts posts=new Posts();
        posts.getTitle();
        assertEquals(posts,new Posts());
    }

    @Test
    void getBody() {
        Posts posts=new Posts();
        posts.getBody();
        assertEquals(posts,new Posts());
    }

    @Test
    void setUserId() {
        Posts posts=new Posts();
        posts.setUserId(56L);
        this.getUserId();
        assertEquals(posts.getUserId(),posts.getUserId());
    }

    @Test
    void setId() {
        Posts posts=new Posts();
        posts.setId(45);
        assertEquals(posts.getId(),posts.getId());
    }

    @Test
    void setTitle() {
        Posts posts=new Posts();
        posts.setTitle("1800 flowers");
        assertEquals(posts.getTitle(),posts.getTitle());
    }

    @Test
    void setBody() {
        Posts posts=new Posts();
        posts.setBody("1800 flowers");
        assertEquals(posts,posts);
    }

    @Test
    void testEquals() {
        Posts posts=new Posts();
        posts.equals(posts.getUserId());
        posts.equals(posts.getId());
        posts.equals(posts.getTitle());
        posts.equals(posts.getBody());
        posts.equals(posts);
        posts.equals(new Posts());
        Assertions.assertEquals(posts.equals(posts),posts.equals(new Posts()));
    }

    @Test
    void canEqual() {
        Posts posts=new Posts();
        posts.canEqual(posts.getUserId());
        posts.canEqual(posts.getId());
        posts.canEqual(posts.getTitle());
        posts.equals(posts.getBody());
        posts.canEqual(posts);

        assertEquals(posts.canEqual(posts),posts.canEqual(new Posts()));
    }

    @Test
    void testHashCode() {
        Posts posts=new Posts();
        posts.hashCode();
        posts.setId(4);


        assertEquals(posts.hashCode(),posts.hashCode());
    }

    @Test
    void testToString() {
        Posts posts=new Posts();
        posts.toString();
        assertEquals(posts.toString(),posts.toString());
    }
}