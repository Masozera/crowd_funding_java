package com.example.crowdfunding.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import com.example.crowdfunding.model.Charity;  
import com.example.crowdfunding.service.CharityService;  
//mark class as Controller  
@RestController  
public class CharitiesController {
	//autowire the Charitieservice class  
	@Autowired  
	CharityService charitiesService;  
	//creating a get mapping that retrieves all the charities detail from the database   
	@GetMapping("/charity")  
	private List<Charity> getAllCharities()   
	{  
	return charitiesService.getAllCharities();  
	}  
	//creating a get mapping that retrieves the detail of a specific charity  
	@GetMapping("/charity/{charity_id}")  
	private Charity getCharities(@PathVariable("charity_id") int charity_id)   
	{  
	return charitiesService.getCharityById(charity_id);  
	}  
	//creating a delete mapping that deletes a specified charity
	@DeleteMapping("/charity/{charity_id}")  
	private void deleteCharity(@PathVariable("charity_id") int charity_id)   
	{  
	charitiesService.delete(charity_id);  
	}  
	//creating post mapping that post the charity detail in the database  
	@PostMapping("/charities")  
	private int saveCharity(@RequestBody Charity charity)   
	{  
	charitiesService.saveOrUpdate(charity);  
	return charity.getCharity_id();  
	}  
	//creating put mapping that updates the charity detail   
	@PutMapping("/charities")  
	private Charity update(@RequestBody Charity charity)   
	{  
	charitiesService.saveOrUpdate(charity);  
	return charity;  

	}

}
