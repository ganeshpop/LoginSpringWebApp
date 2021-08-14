package com.ganesh.model.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Setter
    @Getter
    private String username;
    @Setter
    @Getter
    private String password;
}