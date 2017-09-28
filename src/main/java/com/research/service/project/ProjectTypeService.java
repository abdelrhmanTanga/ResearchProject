package com.research.service.project;

import java.util.List;

import com.research.dto.project.ProjectTypeDto;
import com.research.entity.ProjectTypes;
import com.research.service.BaseService;

public interface ProjectTypeService extends BaseService<ProjectTypes> {
	ProjectTypeDto addProjectType(ProjectTypeDto projectTypeDto);
	List<ProjectTypeDto> getAllProjectTypes();

}
