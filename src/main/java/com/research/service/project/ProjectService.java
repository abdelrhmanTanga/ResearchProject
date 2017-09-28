package com.research.service.project;

import java.util.List;

import com.research.dto.project.ProjectDto;
import com.research.entity.Project;
import com.research.service.BaseService;

public interface ProjectService extends BaseService<Project> {
	ProjectDto addProject(ProjectDto projectDto);

	List<ProjectDto> getAllProjects();

	ProjectDto updateProject(ProjectDto projectDto);
}
