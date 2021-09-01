package com.friday.service;

import com.friday.dto.UserDTO;
import com.friday.entity.User;

import java.nio.file.AccessDeniedException;
import java.util.List;

public interface UserService {

    UserDTO findByEmail(String email);

    List<UserDTO>listAllUsers();


    void save(UserDTO dto);

    void delete(String email);

    UserDTO update(UserDTO userDTO);








}
