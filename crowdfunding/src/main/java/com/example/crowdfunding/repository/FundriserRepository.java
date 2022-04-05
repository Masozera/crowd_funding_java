package com.example.crowdfunding.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.crowdfunding.model.Fundriser;

public interface FundriserRepository  extends CrudRepository<Fundriser, Integer> {

}
