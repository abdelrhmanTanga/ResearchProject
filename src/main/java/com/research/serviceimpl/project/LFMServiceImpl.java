package com.research.serviceimpl.project;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.hibernate.loader.custom.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.research.dto.project.LFMDto;
import com.research.entity.Lfm;
import com.research.entity.Project;
import com.research.exception.BusinessException;
import com.research.repositories.BaseRepository;
import com.research.repositories.project.LFMRepo;
import com.research.service.project.LFMService;
import com.research.service.project.ProjectService;
import com.research.serviceimpl.BaseServiceImpl;

@Service
public class LFMServiceImpl extends BaseServiceImpl<Lfm> implements LFMService {

	@Autowired
	LFMRepo lFMRepo;
	@Autowired
	DozerBeanMapper mapper;
	@Autowired
	ProjectService projectService;

	@Override
	public BaseRepository getBaseRepo() {
		return lFMRepo;
	}

	@Override
	public LFMDto addLFMDto(LFMDto lFMDto) {
		Lfm lfm = null;
		try {
			lfm = new Lfm();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		// project.setTypeId(projectTypeService.getOne(projectDto.getProjectTypeId()));
		lfm = save(lfm);
		return mapper.map(lfm, lFMDto.getClass());
	}

	@Override
	public LFMDto getLFM(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Lfm findOne(Long id){
		Lfm lfm = this.getOne(id);
		if (lfm == null){
			throw new BusinessException();
		}
		return lfm;
	}
	@Override
	public LFMDto updateLFM(LFMDto lFMDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lfm getLFMByProjectid(Long projectId) {
		return (Lfm) projectService.getOne(projectId).getLfmCollection().toArray()[0];

	}

}
