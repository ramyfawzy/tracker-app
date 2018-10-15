package com.gamigo.tracker.bean;


import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;
 
@Named
@ViewScoped
public class PanelView implements Serializable {
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 7615378835594925800L;
	private DashboardModel model;
     
    @PostConstruct
    public void init() {
        model = new DefaultDashboardModel();
        DashboardColumn column1 = new DefaultDashboardColumn();
        DashboardColumn column2 = new DefaultDashboardColumn();
        DashboardColumn column3 = new DefaultDashboardColumn();
        DashboardColumn column4 = new DefaultDashboardColumn();
         
        column1.addWidget("Germany");
        column1.addWidget("France");
         
        column2.addWidget("Italy");
        column2.addWidget("Hungary");
         
        column3.addWidget("China");
        column3.addWidget("Malaysia");
        
        column1.addWidget("Usa");
        column2.addWidget("Canada");
 
        model.addColumn(column1);
        model.addColumn(column2);
        model.addColumn(column3);
        model.addColumn(column4);
    }
     
    /*public void handleReorder(DashboardReorderEvent event) {
        FacesMessage message = new FacesMessage();
        message.setSeverity(FacesMessage.SEVERITY_INFO);
        message.setSummary("Reordered: " + event.getWidgetId());
        message.setDetail("Item index: " + event.getItemIndex() + ", Column index: " + event.getColumnIndex() + ", Sender index: " + event.getSenderColumnIndex());
         
        addMessage(message);
    }
     
    public void handleClose(CloseEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Panel Closed", "Closed panel id:'" + event.getComponent().getId() + "'");
         
        addMessage(message);
    }
     
    public void handleToggle(ToggleEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, event.getComponent().getId() + " toggled", "Status:" + event.getVisibility().name());
         
        addMessage(message);
    }
     
    private void addMessage(FacesMessage message) {
        FacesContext.getCurrentInstance().addMessage(null, message);
    }*/
     
    public DashboardModel getModel() {
        return model;
    }
}