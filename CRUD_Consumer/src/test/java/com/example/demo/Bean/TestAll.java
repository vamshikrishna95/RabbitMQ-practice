package com.example.demo.Bean;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ EmployeeDTOTest.class, })
public class TestAll {
	
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
	
}
