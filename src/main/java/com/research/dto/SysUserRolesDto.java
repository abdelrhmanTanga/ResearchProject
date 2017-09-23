package com.research.dto;

public class SysUserRolesDto extends BaseDto {
	private long id;
	private String name;
	private RoleDto roleId;
	private SysUserDto userId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public SysUserRolesDto() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RoleDto getRoleId() {
		return roleId;
	}

	public void setRoleId(RoleDto roleId) {
		this.roleId = roleId;
	}

	public SysUserDto getUserId() {
		return userId;
	}

	public void setUserId(SysUserDto userId) {
		this.userId = userId;
	}

}