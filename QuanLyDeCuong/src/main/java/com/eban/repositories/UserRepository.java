/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eban.repositories;

import com.eban.pojo.User;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface UserRepository {

    List<User> getListTeacher();

    User getUserByUsername(String username);

    void addUser(User user);

    boolean authUser(String username, String password);
}