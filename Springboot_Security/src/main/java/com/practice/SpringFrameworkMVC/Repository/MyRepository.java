package com.practice.SpringFrameworkMVC.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.SpringFrameworkMVC.Entity.User;

@Repository
public interface MyRepository extends JpaRepository<User, Integer> {
	
	User findByUsername(String username);

}
