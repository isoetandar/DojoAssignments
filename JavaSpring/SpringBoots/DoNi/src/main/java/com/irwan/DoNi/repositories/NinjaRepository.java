package com.irwan.DoNi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.irwan.DoNi.models.Ninja;


@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {

}