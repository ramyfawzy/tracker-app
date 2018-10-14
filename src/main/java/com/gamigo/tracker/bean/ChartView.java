package com.gamigo.tracker.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.chart.PieChartModel;
 
@ManagedBean
public class ChartView implements Serializable {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 143477534715365019L;
	private PieChartModel livePieModel;
    
    @PostConstruct
    public void init() {
    	livePieModel = new PieChartModel();
    }
 
    public PieChartModel getLivePieModel() {
        int random1 = (int)(Math.random() * 1000);
        int random2 = (int)(Math.random() * 1000);
 
        livePieModel.getData().put("Success", random1);
        livePieModel.getData().put("Fail", random2);
         
        livePieModel.setTitle("1153 Downloads");
        livePieModel.setLegendPosition("ne");
         
        return livePieModel;
    }
     
}
