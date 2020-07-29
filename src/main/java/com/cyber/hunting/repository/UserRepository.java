package com.cyber.hunting.repository;

import com.cyber.hunting.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findByNameAndPassword(String name,String password);
}
