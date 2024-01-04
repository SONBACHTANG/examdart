package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Custom;
@Repository
public interface CustomRepository extends JpaRepository<Custom, Long> {
	 

}
