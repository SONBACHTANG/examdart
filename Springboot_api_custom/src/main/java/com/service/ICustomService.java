package com.service;

import java.util.List;

import com.dto.CustomDTO;


public interface ICustomService {

	List<CustomDTO> findAll();
	CustomDTO save( CustomDTO customDTO);
	CustomDTO update();
}
