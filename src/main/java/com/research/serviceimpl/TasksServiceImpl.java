package com.research.serviceimpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.research.dto.project.TaskDTO;
import com.research.entity.Lfm;
import com.research.entity.Tasks;
import com.research.repositories.BaseRepository;
import com.research.repositories.project.TasksRepository;
import com.research.service.TasksService;

@Service
public class TasksServiceImpl extends BaseServiceImpl<Tasks> implements TasksService{

	@Autowired
	private TasksRepository tasksRepository;
	
//	@Autowired
//	private 
	
	@Override
	public BaseRepository getBaseRepo() {
		return tasksRepository;
	}

	@Override
	public TaskDTO addTask(TaskDTO taskDTO) {
		Tasks tasks = new Tasks();
		tasks.setCreateDate(taskDTO.getCreationDate());
		tasks.setDuration(taskDTO.getDuration());
		tasks.setEndDate(taskDTO.getEndDate());
		tasks.setName(taskDTO.getName());
//		Lfm lfm = new Lfm();
//		lfm.setId(taskDTO.getId());
//		tasks.setLfmId(lfm);
		tasks.setStartDate(new Date());
		tasks = this.save(tasks);
		this.save(tasks);
		taskDTO.setId(tasks.getId());
		// TODO
		return taskDTO;
	}

	
}
