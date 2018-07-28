package com.example.accountservice.resources;

import com.example.accountservice.services.UserService;
import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.*;

//@WebMvcTest(value = UserResource.class, secure = false)
//@RunWith(SpringRunner.class)
public class UserResourceTest {

//    @Autowired
//    private MockMvc mockMvc;

//    @MockBean
    private UserService userService = mock(UserService.class);

    @Before
    public void setUp(){
        when(userService.getAccounts()).thenReturn(Lists.newArrayList());
    }

    @Test
    public void shouldReturn200() throws Exception {

//        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/users"))
//                .andExpect(MockMvcResultMatchers.status().isOk());
    }



}
