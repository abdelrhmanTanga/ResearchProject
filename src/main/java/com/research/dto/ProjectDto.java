package com.research.dto;

public class ProjectDto extends BaseDto{

	private Long id;
	private String title;
	private String type;
	private String applicantName;
	private String applicantOrganization;
	private Double budget;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getApplicantOrganization() {
		return applicantOrganization;
	}
	public void setApplicantOrganization(String applicantOrganization) {
		this.applicantOrganization = applicantOrganization;
	}
	public Double getBudget() {
		return budget;
	}
	public void setBudget(Double budget) {
		this.budget = budget;
	}
	
	
}
