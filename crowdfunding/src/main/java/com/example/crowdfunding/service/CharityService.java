package com.example.crowdfunding.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.example.crowdfunding.model.Charity;  
import com.example.crowdfunding.repository.CharityRepository;  
//defining the business logic  
@Service  

public class CharityService {
	
	@Autowired  
	CharityRepository charityRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Charity> getAllCharities()   
	{  
	List<Charity> charities = new ArrayList<Charity>();  
	charityRepository.findAll().forEach(charities1 -> charities.add(charities1));  
	return charities;  
	}  
	//getting a specific record by using the method findById() of CrudRepository  
	public Charity getCharityById(int id)   
	{  
	return charityRepository.findById(id).get();  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Charity charities)   
	{  
	charityRepository.save(charities);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
	charityRepository.deleteById(id);  
	}  
	//updating a record  
	public void update(Charity charities, int charity_id)   
	{  
	charityRepository.save(charities);  
	}  

}
