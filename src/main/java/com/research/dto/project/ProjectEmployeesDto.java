package com.research.dto.project;

import com.research.dto.BaseDto;
import com.research.dto.sysuser.EmployeeDto;

public class ProjectEmployeesDto extends BaseDto {

	private static final long serialVersionUID = 1L;


	private String role;
	private Float participation;
	private Integer months;
	private Double bonus;
	private EmployeeDto employeeId;
	private ProjectDto projectId;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Float getParticipation() {
		return participation;
	}

	public void setParticipation(Float participation) {
		this.participation = participation;
	}

	public Integer getMonths() {
		return months;
	}

	public void setMonths(Integer months) {
		this.months = months;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}

	public EmployeeDto getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(EmployeeDto employeeId) {
		this.employeeId = employeeId;
	}

	public ProjectDto getProjectId() {
		return projectId;
	}

	public void setProjectId(ProjectDto projectId) {
		this.projectId = projectId;
	}

}