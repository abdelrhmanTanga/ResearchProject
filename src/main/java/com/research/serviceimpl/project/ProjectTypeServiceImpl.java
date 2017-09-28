package com.research.serviceimpl.project;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.research.dto.project.ProjectTypeDto;
import com.research.entity.ProjectTypes;
import com.research.repositories.BaseRepository;
import com.research.repositories.project.ProjectTypeRepo;
import com.research.service.project.ProjectTypeService;
import com.research.serviceimpl.BaseServiceImpl;
@Service
public class ProjectTypeServiceImpl extends BaseServiceImpl<ProjectTypes> implements ProjectTypeService {

	@Autowired
	DozerBeanMapper mapper;
	@Autowired
	ProjectTypeRepo projectTypeRepo;

	@Override
	public BaseRepository getBaseRepo() {
		return projectTypeRepo;
	}

	@Override
	public ProjectTypeDto addProjectType(ProjectTypeDto projectTypeDto) {
		ProjectTypes projectTypes = save(mapper.map(projectTypeDto, ProjectTypes.class));
		return mapper.map(projectTypes, ProjectTypeDto.class);
	}

	@Override
	public List<ProjectTypeDto> getAllProjectTypes() {
		List<ProjectTypeDto> projectTypeDtos = new ArrayList<>();
		mapper.map(getAll(), projectTypeDtos);
		return projectTypeDtos;
	}

}
