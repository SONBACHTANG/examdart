package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.component.CustomConvert;
import com.dto.CustomDTO;
import com.entity.Custom;
import com.repository.CustomRepository;
import com.service.ICustomService;
@Service

public class CustomServiceimpl implements ICustomService {

	
	
	@Autowired
	private CustomRepository customRepository;
	
	@Autowired
	private CustomConvert customConvert;
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<CustomDTO> findAll() {
		List<CustomDTO> dtos=new ArrayList<CustomDTO>();
		List<Custom> entities= customRepository.findAll();
		for(Custom item:entities) {
			CustomDTO	dto=customConvert.toDTO(item);
			dtos.add(dto);
		}
		return dtos;
	}

	@Override
	@Transactional
	public CustomDTO save(CustomDTO customDTO) {
		Custom entity =customConvert.toEntity(customDTO);
		customRepository.save(entity);
		
		return null;
	}

	@Override
	public CustomDTO update() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
