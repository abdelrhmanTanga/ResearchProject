package com.research.dto.project;

import com.research.dto.BaseDto;

public class TasksExpectedOutcomesDto extends BaseDto {

	private static final long serialVersionUID = 1L;
	private String expectation;
	private TaskDTO taskId;
	private Long taskIdLong;

	public Long getTaskIdLong() {
		return taskIdLong;
	}

	public void setTaskIdLong(Long taskIdLong) {
		this.taskIdLong = taskIdLong;
	}

	public String getExpectation() {
		return expectation;
	}

	public void setExpectation(String expectation) {
		this.expectation = expectation;
	}
	
	public TaskDTO getTaskId() {
		return taskId;
	}

	public void setTaskId(TaskDTO taskId) {
		this.taskId = taskId;
	}

}
