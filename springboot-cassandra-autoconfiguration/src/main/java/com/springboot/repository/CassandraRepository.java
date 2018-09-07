package com.springboot.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.SimpleTable;

@Repository
public interface CassandraRepository extends CrudRepository<SimpleTable, Serializable> {
	
	Optional<SimpleTable> findByIdAndName(String id, String name);

}