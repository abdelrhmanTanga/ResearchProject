package com.research.dto;

public class TasksExpectedOutcomesDto extends BaseDto {
	private long id;
	private String expectation;
	private TasksDto taskId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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
