package com.example.crowdfunding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.crowdfunding.model.Fundriser;
import com.example.crowdfunding.service.FundriserService;

public class FundriserContoller {
	
	//autowire the Charitieservice class  
		@Autowired  
		FundriserService fundrisersService;  
		//creating a get mapping that retrieves all the fundriser detail from the database   
		@GetMapping("/charity")  
		private List<Fundriser> getAllFundrisers()   
		{  
		return fundrisersService.getAllFundrisers();  
		}  
		//creating a get mapping that retrieves the detail of a specific charity  
		@GetMapping("/fundriser/{fundriser_id}")  
		private Fundriser getFundrisers(@PathVariable("fundriser_id") int fundriser_id)   
		{  
		return fundrisersService.getFundriserById(fundriser_id);  
		}  
		//creating a delete mapping that deletes a specified charity
		@DeleteMapping("/fundriser/{fundriser_id}")  
		private void deleteFundriser(@PathVariable("fundriser_id") int fundriser_id)   
		{  
		fundrisersService.delete(fundriser_id);  
		}  
		//creating post mapping that post the charity detail in the database  
		@PostMapping("/fundrisers")  
		private int saveCharity(@RequestBody Fundriser fundriser)   
		{  
		fundrisersService.saveOrUpdate(fundriser);  
		return fundriser.getFundriser_id();  
		}  
		//creating put mapping that updates the charity detail   
		@PutMapping("/fundriser")  
		private Fundriser update(@RequestBody Fundriser fundriser)   
		{  
		fundrisersService.saveOrUpdate(fundriser);  
		return fundriser;  

		}

}
