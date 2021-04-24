package com.friday.implementation;

import com.friday.dto.ProductDTO;
import com.friday.dto.UserDTO;
import com.friday.entity.Product;
import com.friday.entity.User;
import com.friday.enums.Status;
import com.friday.repository.UserRepository;
import com.friday.service.UserService;
import com.friday.util.MapperUtil;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserServiceImpl implements UserService {

    private MapperUtil mapperUtil;
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public UserServiceImpl(MapperUtil mapperUtil, UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.mapperUtil = mapperUtil;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDTO findByEmail(String email) {
        User user = userRepository.findByEmail(email);
        UserDTO userDTO=mapperUtil.convert(user,new UserDTO());
        return userDTO;
    }

    @Override
    public List<UserDTO> listAllUsers() {
        List<User>listUsers=userRepository.findAll();
        return listUsers.stream().map(obj->{return mapperUtil.convert(obj,new UserDTO());})
                .collect(Collectors.toList());
    }


    @Override
    public UserDTO save(UserDTO dto) {
        dto.setUserStatus(Status.ACTIVE);
        User user=mapperUtil.convert(dto, new User());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        User save=userRepository.save(user);
        return mapperUtil.convert(save, new UserDTO());

    }

    @Override
    public void delete(String email) {
        User user = userRepository.findByEmail(email);
        user.setEmail(user.getEmail()+"-"+user.getId());
        user.setEnabled(false);
        user.setStatus(Status.PASSIVE);


    }

    @Override
    public void update(UserDTO userDTO) {
        User user=userRepository.findByEmail(userDTO.getEmail());
        User convertedUser=mapperUtil.convert(userDTO,new User());
        convertedUser.setPassword(passwordEncoder.encode(convertedUser.getPassword()));
        convertedUser.setId(user.getId());
        userRepository.save(convertedUser);

    }
}