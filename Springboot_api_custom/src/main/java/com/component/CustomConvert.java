package com.component;

import org.springframework.stereotype.Component;

import com.dto.CustomDTO;
import com.entity.Custom;

@Component
public class CustomConvert {
	
	
	public CustomDTO toDTO(Custom custom) {
		CustomDTO dto=new CustomDTO();
		
		dto.setId(custom.getId());
		dto.setFullname(custom.getFullname());
		dto.setPhone(custom.getPhone());
		dto.setBirtday(custom.getBirtday());
		dto.setAddress(custom.getAddress());
		
		return dto;
	}
	
	public Custom toEntity(CustomDTO customdto) {
		Custom entity=new Custom();
		
		entity.setId(customdto.getId());
		entity.setFullname(customdto.getFullname());
		entity.setPhone(customdto.getPhone());
		entity.setBirtday(customdto.getBirtday());
		entity.setAddress(customdto.getAddress());
		
		return entity;
	}
	

}
