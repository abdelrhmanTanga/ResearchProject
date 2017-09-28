package com.research.dto.project;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.research.dto.BaseDto;

public class TaskDTO extends BaseDto implements Serializable{

	private Long id;
	private Date creationDate;
	private Date modifyDate;
    private Date retireDate;
    private boolean retired;
    private Date startDate;
    private Date endDate;
    private Integer duration;
    private Long lfmId;
    private String name;
    private List<TasksExpectedOutcomesDto> taskExpectedOutcomes = new ArrayList<>();
    
	public List<TasksExpectedOutcomesDto> getTaskExpectedOutcomes() {
		return taskExpectedOutcomes;
	}
	public void setTaskExpectedOutcomes(
			List<TasksExpectedOutcomesDto> taskExpectedOutcomes) {
		this.taskExpectedOutcomes = taskExpectedOutcomes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public Date getRetireDate() {
		return retireDate;
	}
	public void setRetireDate(Date retireDate) {
		this.retireDate = retireDate;
	}
	public boolean isRetired() {
		return retired;
	}
	public void setRetired(boolean retired) {
		this.retired = retired;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Long getLfmId() {
		return lfmId;
	}
	public void setLfmId(Long lfmId) {
		this.lfmId = lfmId;
	}
}
