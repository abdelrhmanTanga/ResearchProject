package com.research.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.research.dto.ProjectDto;
import com.research.entity.Project;
import com.research.entity.ProjectTypes;
import com.research.repositories.BaseRepository;
import com.research.repositories.ProjectRepo;
import com.research.service.ProjectService;

@Service
public class ProjectServiceImpl extends BaseServiceImpl<Project> implements ProjectService {

	@Autowired
	ProjectRepo projectRepo;
	@Autowired
	DozerBeanMapper mapper;

	@Override
	public BaseRepository getBaseRepo() {
		// TODO Auto-generated method stub
		return projectRepo;
	}

	@Override
	public ProjectDto addProject(ProjectDto projectDto) {
		// TODO Auto-generated method stub
		Project project = mapper.map(projectDto, Project.class);
		// project.setId(1L);
		project = save(project);
		return mapper.map(project, projectDto.getClass());
	}

	@Override
	public List<ProjectDto> getAllProjects() {
		// TODO Auto-generated method stub
		List<ProjectDto> projectsDto = new ArrayList<>();
		mapper.map(getAll(), projectsDto);
		return projectsDto;
	}

	@Override
	public ProjectDto updateProject(ProjectDto projectDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
