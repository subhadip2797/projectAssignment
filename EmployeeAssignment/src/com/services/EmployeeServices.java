package com.services;

import com.model.Employee;

import java.util.*;

public class EmployeeServices {
	
	private static HashMap<Long, Employee> employeeMap = new HashMap<Long, Employee>();
	private static long employeeIdCounter = 1;
	
	public long addEmployee(Employee employee)
	{
		employee.setEmpId(employeeIdCounter);
		employeeMap.put(employeeIdCounter, employee);
		employeeIdCounter++;
		return employee.getEmpId();
	}
	
	public String getEmployee()
	{
		List<Employee> valueList = new ArrayList<Employee>(employeeMap.values());
		return valueList.toString();
	}
	
	public Employee getEmployeeById(long id)
	{
		if(employeeMap.containsKey(id))
		{
			return employeeMap.get(id);
		}
		return null;
	}
	
	public boolean deleteEmployee(long id)
	{
		if(employeeMap.containsKey(id))
		{
			employeeMap.remove(id);
			return true;
		}
		return false;
	}
	
	public long updateEmployeeName(String name, long id)
	{
		if(employeeMap.containsKey(id))
		{
			employeeMap.get(id).setEmpName(name);
			return employeeMap.get(id).getEmpId();
		}
		return 0;
	}
	
	public long updateEmployeeAge(int age, long id)
	{
		if(employeeMap.containsKey(id))
		{
			employeeMap.get(id).setEmpAge(age);
			return employeeMap.get(id).getEmpId();
		}
		return 0;
	}
	
	public long updateEmployeeAddress(String address, long id)
	{
		if(employeeMap.containsKey(id))
		{
			employeeMap.get(id).setEmpAddress(address);
			return employeeMap.get(id).getEmpId();
		}
		return 0;
		
	}
}
