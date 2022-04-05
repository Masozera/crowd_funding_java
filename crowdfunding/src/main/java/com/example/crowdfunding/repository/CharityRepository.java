package com.example.crowdfunding.repository;

import org.springframework.data.repository.CrudRepository;  
import com.example.crowdfunding.model.Charity;  
//repository that extends CrudRepository

public interface CharityRepository  extends CrudRepository<Charity, Integer>  {

}
