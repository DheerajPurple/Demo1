package com.purple.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.purple.demo1.pojo.UserPojo1;

@Repository
public interface IUserRepository1 extends JpaRepository<UserPojo1, Integer> {

}
