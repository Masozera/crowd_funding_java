package com.example.crowdfunding.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.crowdfunding.model.Fundriser;
import com.example.crowdfunding.repository.FundriserRepository;

public class FundriserService {
	@Autowired  
	FundriserRepository fundriserRepository;  
	//getting all fundrisers record by using the method findaAll() of CrudRepository  
	public List<Fundriser> getAllFundrisers()   
	{  
	List<Fundriser> fundrisers = new ArrayList<Fundriser>();  
	fundriserRepository.findAll().forEach(fundrisers1 -> fundrisers.add(fundrisers1));  
	return fundrisers;  
	}  
	//getting a specific record by using the method findById() of CrudRepository  
	public Fundriser getFundriserById(int id)   
	{  
	return fundriserRepository.findById(id).get();  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Fundriser fundrisers)   
	{  
	fundriserRepository.save(fundrisers);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
	fundriserRepository.deleteById(id);  
	}  
	//updating a record  
	public void update(Fundriser fundrisers, int charity_id)   
	{  
	fundriserRepository.save(fundrisers);  
	}  

}
