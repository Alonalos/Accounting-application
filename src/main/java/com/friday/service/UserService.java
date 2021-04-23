package com.friday.service;

import com.friday.dto.UserDTO;
import com.friday.entity.User;

import java.nio.file.AccessDeniedException;
import java.util.List;

public interface UserService {
    List<UserDTO> listAllUsers();

    UserDTO findByEmail(String userEmail);

    UserDTO save(UserDTO user);

    UserDTO update(UserDTO dto);

    void delete(Long id);

    void deleteByEmail(Long id);

    List<UserDTO> listAllByRole(String role);

    UserDTO confirm(User user);
}
