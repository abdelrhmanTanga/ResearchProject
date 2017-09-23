package com.research.service;

import java.util.List;

import com.research.dto.ProjectDto;
import com.research.entity.Project;

public interface ProjectService  {
	ProjectDto addProject(ProjectDto projectDto);
	List<ProjectDto> getAllProjects();
	ProjectDto updateProject(ProjectDto projectDto);
}
