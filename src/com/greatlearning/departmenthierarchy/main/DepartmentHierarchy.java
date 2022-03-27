package com.greatlearning.departmenthierarchy.main;

import com.greatlearning.departmenthierarchy.service.AdminDepartment;
import com.greatlearning.departmenthierarchy.service.HrDepartment;
import com.greatlearning.departmenthierarchy.service.TechDepartment;

public class DepartmentHierarchy {

	public static void main(String[] args) {

		AdminDepartment adminDepartment = new AdminDepartment();
		HrDepartment hrDepartment = new HrDepartment();
		TechDepartment techDepartment = new TechDepartment();

		System.out.println(adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday() + "\n");

		System.out.println(hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTodayAHoliday() + "\n");

		System.out.println(techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayAHoliday());

	}
}
