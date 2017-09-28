package com.research.service.project;

import com.research.dto.project.LFMDto;
import com.research.entity.Lfm;

public interface LFMService {
	LFMDto addLFMDto(LFMDto lFMDto);

	LFMDto getLFM(Long id);
	
	Lfm findOne(Long id);

	LFMDto updateLFM(LFMDto lFMDto);

	Lfm getLFMByProjectid(Long projectId);

}
