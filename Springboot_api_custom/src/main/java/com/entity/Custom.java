package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "custom")

public class Custom {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	    private Long id;
	    @Column(name = "name_custom")
	    private String fullname;
	    private String address;
	    private String phone;
	    private String birthday;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFullname() {
			return fullname;
		}
		public void setFullname(String fullname) {
			this.fullname = fullname;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getBirtday() {
			return birthday;
		}
		public void setBirtday(String birthday) {
			this.birthday = birthday;
		}
		
	    
	    
	    

}
