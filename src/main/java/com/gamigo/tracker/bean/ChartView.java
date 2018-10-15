package com.gamigo.tracker.bean;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.primefaces.model.chart.DonutChartModel;
import org.primefaces.model.chart.PieChartModel;
 
@Named
public class ChartView implements Serializable {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 143477534715365019L;
	private PieChartModel livePieModel;
	private DonutChartModel donutModel; 
    @PostConstruct
    public void init() {
    	livePieModel = new PieChartModel();
    	createDonutModels();
    }
 
    public PieChartModel getLivePieModel() {
        int random1 = (int)(Math.random() * 1000);
        int random2 = (int)(Math.random() * 1000);
 
        livePieModel.getData().put("Success", random1);
        livePieModel.getData().put("Fail", random2);
         
        livePieModel.setTitle("1153 Downloads");
        livePieModel.setLegendPosition("ne");
        livePieModel.setSeriesColors("fdcd21 , 999999"); 
        
        return livePieModel;
    }
    
    public DonutChartModel getDonutModel() {
		return donutModel;
	}

	public void setDonutModel(DonutChartModel donutModel) {
		this.donutModel = donutModel;
	}

	private void createDonutModels() {
        donutModel = initDonutModel();
//        donutModel.setTitle("");
//        donutModel.setLegendPosition("");
        donutModel.setSliceMargin(1);
        donutModel.setShowDataLabels(true);
        donutModel.setDataFormat("value");
        donutModel.setShadow(false);
    }
 
    private DonutChartModel initDonutModel() {
    	donutModel = new DonutChartModel();
         
        Map<String, Number> circle1 = new LinkedHashMap<String, Number>();
        circle1.put("Success", 1547);
        circle1.put("Fail", 121);
        donutModel.setSeriesColors("fdcd21 , f5f5f5");
        donutModel.addCircle(circle1);
         
        return donutModel;
    }
     
}
