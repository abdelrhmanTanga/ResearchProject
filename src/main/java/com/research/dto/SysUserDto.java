package com.research.dto;

import java.util.Collection;

import com.research.entity.SysUserRoles;

public class SysUserDto extends BaseDto {
	private long id;
	private String userName;
	private String password;

	private Collection<SysUserRoles> sysUserRolesCollection;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<SysUserRoles> getSysUserRolesCollection() {
		return sysUserRolesCollection;
	}

	public void setSysUserRolesCollection(Collection<SysUserRoles> sysUserRolesCollection) {
		this.sysUserRolesCollection = sysUserRolesCollection;
	}

}