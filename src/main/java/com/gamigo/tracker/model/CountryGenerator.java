package com.gamigo.tracker.model;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
 
@Named
@ApplicationScoped
public class CountryGenerator {
     
    private final static String[] names;
     
     
    static {
    	names = new String[10];
    	names[0] = "Germany";
    	names[1] = "Poland";
    	names[2] = "Italy";
    	names[3] = "Spain";
    	names[4] = "Turkey";
    	names[5] = "Hungary";
    	names[6] = "Netherlands";
    	names[7] = "Denmark";
    	names[8] = "Norway";
    	names[9] = "Swizerland";
    }
     
    public List<Country> createCounties(int size) {
        List<Country> list = new ArrayList<Country>();
        for(int i = 0 ; i < size ; i++) {
            list.add(new Country(names[i], getRandomSuccess(), getRandomFailed(), getRandomPercentage()));
        }
         
        return list;
    }
     
    private Long getRandomSuccess() {
    	Random r = new Random();
		Integer i = r.ints(500, 2000).findFirst().getAsInt();
        return Long.valueOf(i.toString(), 10);
    }
    
    private Long getRandomFailed() {
    	Random r = new Random();
		Integer i = r.ints(1, 500).findFirst().getAsInt();
        return Long.valueOf(i.toString(), 10);
    }
     
    private Double getRandomPercentage() {
    	double leftLimit = 40D;
        double rightLimit = 100D;
        double generatedDouble = leftLimit + new Random().nextDouble() * (rightLimit - leftLimit);
        return generatedDouble;
    }
     
    public int getRandomPrice() {
        return (int) (Math.random() * 100000);
    }
     
    public boolean getRandomSoldState() {
        return (Math.random() > 0.5) ? true: false;
    }
     
    public List<String> getNames() {
        return Arrays.asList(names);
    }
}
