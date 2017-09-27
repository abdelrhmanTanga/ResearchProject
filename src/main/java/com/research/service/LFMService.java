package com.research.service;

import com.research.dto.LFMDto;
import com.research.entity.Lfm;

public interface LFMService {
	LFMDto addLFMDto(LFMDto lFMDto);

	LFMDto getLFM(Long id);
	
	Lfm findOne(Long id);

	LFMDto updateLFM(LFMDto lFMDto);
}
