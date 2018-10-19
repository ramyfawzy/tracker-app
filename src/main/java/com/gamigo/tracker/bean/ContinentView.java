package com.gamigo.tracker.bean;


import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.gamigo.tracker.model.Country;
import com.gamigo.tracker.model.CountryGenerator;
 
@Named
@ViewScoped
public class ContinentView implements Serializable {
     
	private static final long serialVersionUID = 7615378835594925800L;
	private List<Country> countries;
	 private Integer progress;
     
	@Inject
	CountryGenerator countryGenerator;
	
    @PostConstruct
    public void init() {
    	countries = countryGenerator.createCounties(10);
    	getProgress();
    }

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}
	
	public Integer getProgress() {
        if(progress == null) {
            progress = 0;
        }
        else {
            progress = progress + (int)(Math.random() * 35);
             
            if(progress > 100)
                progress = 100;
        }
         
        return progress;
    }
	
	public void setProgress(Integer progress) {
        this.progress = progress;
    }
    
    
     
}