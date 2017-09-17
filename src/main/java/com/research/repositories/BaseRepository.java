package com.research.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends PagingAndSortingRepository<T, ID> {

	@Query("from #{#entityName} t where t.retired = false")
	public List<T> findAll();
	
	@Query("from #{#entityName} t where t.retired = false and t.id = ?")
	public T findOne(Long id);
	
	@Query("update #{#entityName} entity set entity.retired = true , entity.retireDate = CURRENT_TIMESTAMP WHERE entity.id = ?")
	public void retireById(Long id);
	
}
