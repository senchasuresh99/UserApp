package net.javaguides.springboot.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import net.javaguides.springboot.model.Role;
import net.javaguides.springboot.model.User;

public class CustomeUserDetail implements UserDetails{
	
	private User user;
	
	public CustomeUserDetail(User user) {
		this.user=user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<Role>roles=user.getRoles();
		List<GrantedAuthority> authorities= new ArrayList<>();
		roles.forEach(r->authorities.add(new SimpleGrantedAuthority(r.getName())));			
		return authorities;
	}

	@Override
	public String getPassword() {		
		return user.getPassword();
	}

	@Override
	public String getUsername() {		
		return user.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}	

}
