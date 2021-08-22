package com.ecommerce.service;

import java.util.Set;

import com.ecommerce.domain.security.User;
import com.ecommerce.domain.security.UserRole;

public interface UserService {
	User createUser(User user, Set<UserRole> userRoles);

	
	

}
