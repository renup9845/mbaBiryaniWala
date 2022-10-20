package com.biryaniwala.controller;

import java.util.List;
import java.util.Optional;

import com.biryaniwala.model.biryani;
import com.biryaniwala.service.biryaniService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class biryaniController {
	
	@Autowired
	private biryaniService service;
	
	//Add One Biryani To DataBase
	@RequestMapping(method = RequestMethod.POST, value = "/biryani")
	public String addBiryani(@RequestBody biryani b1) {
		
		return service.addBiryani(b1);
		
	}
	
	//Add Multiple Biryanis To DataBase
	@RequestMapping(method = RequestMethod.POST, value = "/biryani/addall")
	public String addAllBiryani(@RequestBody List<biryani> b1) {		
	
		return service.addAllBiryani(b1);
	
	}
	
	//To Retrieve All Biryanis
	@RequestMapping(method = RequestMethod.GET, value = "/biryani/")
	public List<biryani> getAllBiryani(){
		
		return service.getAllBiryani();
	}
	
	//To Retrieve Biryani with Id
	@RequestMapping(method = RequestMethod.GET, value ="/biryani/id/{id}")
	public Optional<biryani> getBiryaniById(@PathVariable int id){
		
		return service.getBiryaniById(id);
	}
	
	//To Retrieve Biryanis with Type
	@RequestMapping(method = RequestMethod.GET, value = "/biryani/type/{btype}")
	public List<biryani> getBiryaniByType(@PathVariable String btype){
		
		return service.getBiryaniByType(btype);
	}	
	
	//To Retrieve Biryanis with Range
	@RequestMapping(method = RequestMethod.GET, value = "/biryani/range/{bprice}")
	public List<biryani> getBiryaniByRange(@PathVariable int bprice){
		
		return service.getBiryaniByRange(bprice);
	}
	
	
	

}
