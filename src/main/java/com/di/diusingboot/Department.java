package com.di.diusingboot;

import org.springframework.stereotype.Component;

@Component
public class Department {

	public String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
