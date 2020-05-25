package com.fastcampus.javaallinon.project1.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class HelloworldControllerTest {

    @Autowired
    private HelloworldController helloworldController;

    private MockMvc mockMvc;

    @Test // 테스트 메소드
    void helloworld() {
//        System.out.println("test");
        System.out.println(helloworldController.welcome());

        assertThat(helloworldController.welcome()).isEqualTo("HELLO WORLD");
    }

    @Test
    void mockMvcTest() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(helloworldController).build();

        mockMvc.perform(MockMvcRequestBuilders.get("/api/helloWorld"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("HELLO WORLD"));
    }
}