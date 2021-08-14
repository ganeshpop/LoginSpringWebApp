package com.ganesh.model.persistence;

import org.springframework.stereotype.Repository;

import com.ganesh.model.database.UserDataBase;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public String getPassword(String username) {
        return UserDataBase.getUsers().get(username);
    }

}