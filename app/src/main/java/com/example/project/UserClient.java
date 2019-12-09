package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import com.example.project.models.User;


public class UserClient extends AppCompatActivity {


    private User user = null;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
