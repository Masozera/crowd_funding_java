package com.example.crowdfunding.model;

import com.example.crowdfunding.model.audit.UserDateAudit;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  


@Entity
@Table(name = "charities")
public class Charity extends UserDateAudit {
	
	@Id  
	@Column  
	private int charity_id;  
	
    
	@Column
    private String owner_name;
	
	@Column
    // @NotBlank
   // @Size(max = 15)
    private String charity_name;

	@Column
    @NotBlank 
    private String description;

    

    public Charity() {

    }

    public Charity(String owner_name, String charity_name, String description) {
        this.owner_name        = owner_name;
        this.charity_name      = charity_name;
        this.description         = description;
        
    }

   // public Long getId() {
    //    return id;
    //}

    //public void setId(Long id) {
     //   this.id = id;
    //}
    
    public int getCharity_id()   
    {  
    return charity_id;  
    }  
    public void setCharity_id(int charity_id)   
    {  
    this.charity_id = charity_id;  
    }  
    

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getCharity_name() {
        return charity_name;
    }

    public void setCharity_name(String charity_name) {
        this.charity_name = charity_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //public String getPassword() {
     //  return password;
    //}

    //public void setPassword(String password) {
    //    this.password = password;
    //}

    //public Set<Role> getRoles() {
    //   return roles;
    //}

    //public void setRoles(Set<Role> roles) {
    //    this.roles = roles;
    //}
}

//foreugn key of user who owns organisation------owner_name