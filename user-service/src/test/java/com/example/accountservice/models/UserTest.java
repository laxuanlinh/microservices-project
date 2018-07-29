package com.example.accountservice.models;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class UserTest {

    @Test
    public void shouldCreateModel(){
        User user = new User("laxuanlinh", "password");
        assertThat(user.getUsername()).isEqualTo("laxuanlinh");
        assertThat(user.getPassword()).isEqualTo("password");
    }
}
