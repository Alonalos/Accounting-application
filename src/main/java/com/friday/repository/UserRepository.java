package com.friday.repository;

import com.friday.entity.Role;
import com.friday.entity.User;
import com.friday.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {

    User findByEmail(String email);

    void deleteByEmail(String email);

    List<User> findAllByStatus(Status status);


}