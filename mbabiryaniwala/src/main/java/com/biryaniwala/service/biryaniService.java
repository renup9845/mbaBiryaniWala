package com.biryaniwala.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.biryaniwala.model.biryani;
import com.biryaniwala.repository.biryaniRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class biryaniService {
	
	@Autowired
	private biryaniRepository biryanirepo;
	
	//Adding Biryani
	public String addBiryani(biryani b1) {
	
		biryanirepo.save(b1);
		return "Biryani Added....";
	
	}
	
	//Adding List Of Biryanis
	public String addAllBiryani(List<biryani> blist) {
		
		biryanirepo.saveAll(blist);
		return "All Biryanis Added Successfully....";
	}
	
	//Retrieving All Biryanis
	public List<biryani> getAllBiryani(){
		
		List<biryani> allbiryani = new ArrayList<>();
		biryanirepo.findAll().forEach(allbiryani::add);
		return allbiryani;
	}
	
	//Retrieve Biryani By Id
	public Optional<biryani> getBiryaniById(int id){
		return biryanirepo.findById(id);
	}
	
	//Retrieve Biryani By Type
	public List<biryani> getBiryaniByType(String btype){
		return biryanirepo.findByBiryaniType(btype);
	}
	
	//Retrieve Biryani within Range
	public List<biryani> getBiryaniByRange(int bprice){
		return biryanirepo.findByBiryaniPrice(bprice);
	}
	
	
}
		

