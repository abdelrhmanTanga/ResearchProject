package com.research.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.research.entity.BaseEntity;

public interface BaseRepository extends PagingAndSortingRepository<BaseEntity, Long> {

}
