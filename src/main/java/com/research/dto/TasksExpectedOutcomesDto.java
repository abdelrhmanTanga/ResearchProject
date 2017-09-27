package com.research.dto;

public class TasksExpectedOutcomesDto extends BaseDto {

	private static final long serialVersionUID = 1L;
	private String expectation;
	private TasksDto taskId;
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

	public TasksDto getTaskId() {
		return taskId;
	}

	public void setTaskId(TasksDto taskId) {
		this.taskId = taskId;
	}

}
