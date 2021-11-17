package com.ravi;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.catalina.User;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
public class MyUserDetails implements UserDetails{
	
	private String username;
	private String password;
	private boolean active;
	private List<SimpleGrantedAuthority> authorities;
	
	MyUserDetails(String username,String password, boolean isactive, List<String> roles){
		this.username=username;
		this.password=password;
		this.active= isactive;
		this.authorities= roles.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());
		
		System.out.println("MyUserDetails.MyUserDetails()::authories="+this.authorities);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		//return Arrays.asList(new SimpleGrantedAuthority(this.authorities.get(2).toString()));
		return this.authorities;
	}

	@Override
	public String getPassword() {
		System.out.println("MyUserDetails.getPassword():"+this.password);
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return active;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return active;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return active;
	}

}
