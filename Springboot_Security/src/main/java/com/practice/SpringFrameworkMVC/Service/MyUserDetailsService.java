package com.practice.SpringFrameworkMVC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.practice.SpringFrameworkMVC.Entity.User;
import com.practice.SpringFrameworkMVC.Repository.MyRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private MyRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=repo.findByUsername(username);
		
		if(user==null)
			throw new UsernameNotFoundException("User 404");
		
		return new UserPrinciple(user);
	}

}
