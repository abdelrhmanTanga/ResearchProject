package com.research.dto;

public class TasksExpectedOutcomesDto extends BaseDto {
	private static final long serialVersionUID = 1L;
	private String expectation;
	private TasksDto taskId;



	public String getExpectation() {
		return expectation;
	}

	public void setExpectation(String expectation) {
		this.expectation = expectation;
	}

	public TasksDto getTaskId() {
		return taskId;
	}

	public void setTaskId(TasksDto taskId) {
		this.taskId = taskId;
	}

}
