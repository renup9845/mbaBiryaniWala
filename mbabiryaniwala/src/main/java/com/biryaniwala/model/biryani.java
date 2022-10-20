package com.biryaniwala.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "biryani_table")

public class biryani {
	
	@Id
	private int biryaniId;
	private String biryaniType;
	private String biryaniName;
	private String biryaniPrice;
	private String biryaniDesc;
	
	
	

}
