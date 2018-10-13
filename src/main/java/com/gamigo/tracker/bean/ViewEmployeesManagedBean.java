package com.gamigo.tracker.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import com.gamigo.tracker.model.Employee;

@ManagedBean
@javax.faces.bean.ViewScoped
public class ViewEmployeesManagedBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8109354395849703723L;
	private List<Employee> employees = new ArrayList<Employee>();
	private String text;
	public ViewEmployeesManagedBean(){
		System.out.println("Constructor .......");
	}
	
	@PostConstruct
	public void populateEmployeeList(){
		System.out.println("PostConstruct ....... "+FacesContext.getCurrentInstance().isPostback());
		for(int i = 1 ; i <= 10 ; i++){
			Employee emp = new Employee();
			emp.setEmployeeId(String.valueOf(i));
			emp.setEmployeeName("Employee#"+i);
			this.employees.add(emp);
		}
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}
