package com.example.how;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.SpringApplication;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
@RunWith(SpringRunner.class)
class HowApplicationTest {
    @InjectMocks HowApplication howApplication;

    @Test
    void main() {
        HowApplication.main(new String[]{});


    }

}