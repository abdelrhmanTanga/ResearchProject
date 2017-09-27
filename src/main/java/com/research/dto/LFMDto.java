package com.research.dto;

import java.util.Collection;

public class LFMDto extends BaseDto {

	private static final long serialVersionUID = 1L;
	private ProjectDto projectDtoId;
	private Collection<TasksDto> tasksDtoCollection;

	public ProjectDto getProjectDtoId() {
		return projectDtoId;
	}

	public void setProjectDtoId(ProjectDto projectDtoId) {
		this.projectDtoId = projectDtoId;
	}

	public Collection<TasksDto> getTasksDtoCollection() {
		return tasksDtoCollection;
	}

	public void setTasksDtoCollection(Collection<TasksDto> tasksDtoCollection) {
		this.tasksDtoCollection = tasksDtoCollection;
	}

}
