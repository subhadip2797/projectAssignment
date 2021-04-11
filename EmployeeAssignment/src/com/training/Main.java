package com.training;

import com.controllers.EmployeeController;
//import java.util.Scanner;


public class Main {
	
	public static void main(String[] args)
	{
		EmployeeController empController = new EmployeeController();
		empController.handleRequest();
	}

}
