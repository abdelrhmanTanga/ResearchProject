package com.research.service;

import java.util.List;

import com.research.dto.ProjectTypeDto;

public interface ProjectTypeService {
	ProjectTypeDto addProjectType(ProjectTypeDto projectTypeDto);
	List<ProjectTypeDto> getAllProjectTypes();

}
