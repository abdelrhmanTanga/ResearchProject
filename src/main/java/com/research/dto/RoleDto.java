package com.research.dto;

import java.util.Collection;

import com.research.entity.SysUserRoles;

public class RoleDto extends BaseDto {
	private long id;
	private String role;
	private String description;
	private Collection<SysUserRoles> sysUserRolesCollection;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Collection<SysUserRoles> getSysUserRolesCollection() {
		return sysUserRolesCollection;
	}

	public void setSysUserRolesCollection(Collection<SysUserRoles> sysUserRolesCollection) {
		this.sysUserRolesCollection = sysUserRolesCollection;
	}

}