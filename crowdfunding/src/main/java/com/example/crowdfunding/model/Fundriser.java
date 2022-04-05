package com.example.crowdfunding.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import com.example.crowdfunding.model.audit.UserDateAudit;

public class Fundriser {

	@Id  
	@Column  
	private int fundriser_id;  
	
    
	@Column
    private String fundriser_title;
	
	@Column
    // @NotBlank
   // @Size(max = 15)
    private String owner_name;

	@Column
    @NotBlank 
    private String description;
	
	
	 public Fundriser() {

	    }

	    public Fundriser(String fundriser_title, String owner_name, String description) {
	        this.fundriser_title       = fundriser_title;
	        this.owner_name            = owner_name;
	        this.description         = description;
	        
	    }
	    
	    
	    public int getFundriser_id()   
	    {  
	    return fundriser_id;  
	    }  
	    public void setFundriser_id(int fundriser_id)   
	    {  
	    this.fundriser_id = fundriser_id;  
	    }  
	    

	    public String getFundriser_title() {
	        return fundriser_title;
	    }

	    public void setOwner_name(String owner_name) {
	        this.owner_name = owner_name;
	    }

	    public String getOwner_name() {
	        return owner_name;
	    }

	    public void setDescription (String description) {
	        this.description = description;
	    }

	    public String getDescription() {
	        return description;
	    }

//	    public void setDescription(String description) {
//	        this.description = description;
//	    }
//	    
	    	

	
}
