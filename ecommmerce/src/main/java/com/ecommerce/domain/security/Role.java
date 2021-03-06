package com.ecommerce.domain.security;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Set;
import java.util.HashSet;


@Entity
public class Role implements Serializable {
	private static final long serialVersionUID=890245234L;
	 @Id
	 private int roleId;
	 private String name;
	 @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	 private Set<UserRole> userRoles=new HashSet<>();
	 public Role() {}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<UserRole> getUserRoles() {
		return userRoles;
	}
	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}
	 

}
