package com.example.RegAuto.service;

import com.example.RegAuto.Entity.User;
import com.example.RegAuto.dto.UserDTO;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO userDTO);

    User findByEmail(String email);

    List<UserDTO> findAllUsers();
}
