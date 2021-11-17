package com.ravi;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ravi.model.User;
import com.ravi.repository.IUserRepository;
import com.ravi.service.IUserRepoService;
import com.ravi.service.UserRepoServiceImpl;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	IUserRepoService userRepoService;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepoService.findUserByUserName(username);
		//System.out.println("loadUserByUsername()::username:"+user.getUsername());
		//System.out.println("loadUserByUsername()::pwd from db:"+user.getPassword());
		if(user==null) {
			throw new UsernameNotFoundException("Not Found:"+username);
		}
		//MyUserDetails myUserDetails = new MyUserDetails(user.getUsername(),user.getPassword(),user.isActive(),user.getRoles());
		//System.out.println("loadUserByUsername()::pwd from db:"+user.isActive());
		System.out.println("MyUserDetailsService.loadUserByUsername(): Role="+user.getRoles());
		return new MyUserDetails(user.getUsername(),user.getPassword(),user.isActive(),user.getRoles());
	}

}
