package com.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.CustomDTO;
import com.service.ICustomService;

@CrossOrigin
@RestController
public class CustomController {
	
	@Autowired 
	private ICustomService customService;
	
	
	  @PostMapping("/addCustomer")
	    public CustomDTO addCustomer(@RequestBody CustomDTO customer) {
	        return customService.save(customer);
	    }
	  
	  @GetMapping("/getAll")
	    public List<CustomDTO> getAllCustomers() {
	        return customService.findAll();
	    }

}
