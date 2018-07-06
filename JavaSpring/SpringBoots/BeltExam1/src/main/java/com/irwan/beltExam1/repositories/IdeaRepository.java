package com.irwan.beltExam1.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.irwan.beltExam1.models.Idea;

@Repository
public interface IdeaRepository extends CrudRepository<Idea, Long> {
	@Override
	List<Idea> findAll();
}