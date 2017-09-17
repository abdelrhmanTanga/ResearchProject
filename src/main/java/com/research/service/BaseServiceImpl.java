package com.research.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.research.entity.BaseEntity;
import com.research.repositories.BaseRepository;

public abstract class BaseServiceImpl<T, ID extends Serializable> implements BaseService<T, Serializable>{

	@Autowired
	private BaseRepository<T,ID> baseRepository;
	
	public List<T> findAll(){
		return baseRepository.findAll();
	}
	
	public T findOne(Long id){
		return baseRepository.findOne(id);
	}
	
	public T update(T entity){
		return baseRepository.save(entity);
	}
	
	public T insert(T entity){
		return baseRepository.save(entity);
	}
	
	public void delete(Long id){
		baseRepository.retireById(id);
	}
}
