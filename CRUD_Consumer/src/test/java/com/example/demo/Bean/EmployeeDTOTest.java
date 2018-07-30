package com.example.demo.Bean;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class EmployeeDTOTest {

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EmployeeDTOTest.class);
	}

	@Test
	public void testToString() throws Exception {
		EmployeeDTO emp = new EmployeeDTO();
		emp.setName("TestName");
		emp.setMobile("123456789");
		emp.setMail("test@gmail.com");
		emp.setSalary("1234");

		Assert.assertEquals("EmployeeDTO [name=TestName, mobile=123456789, mail=test@gmail.com, salary=1234]", emp.toString());
	}

	@Test
	public void testGetName() throws Exception {
		EmployeeDTO emp = new EmployeeDTO();
		emp.setName("TestName");
		emp.setMobile("123456789");
		emp.setMail("test@gmail.com");
		emp.setSalary("1234");

		Assert.assertNotNull(emp);
		Assert.assertEquals("TestName", emp.getName());
		Assert.assertNotEquals("demo", emp.getName());
	}

	@Test
	public void testSetName() throws Exception {
		EmployeeDTO emp = new EmployeeDTO();
		emp.setName("TestName");

		Assert.assertNotNull(emp);
		Assert.assertEquals("TestName", emp.getName());
		Assert.assertNotEquals("demo", emp.getName());
	}

	@Test
	public void testGetMobile() throws Exception {
		EmployeeDTO emp = new EmployeeDTO();
		emp.setName("TestName");
		emp.setMobile("123456789");
		emp.setMail("test@gmail.com");
		emp.setSalary("1234");

		Assert.assertNotNull(emp);
		Assert.assertEquals("123456789", emp.getMobile());
		Assert.assertNotEquals("1111111111", emp.getMobile());
	}

	@Test
	public void testSetMobile() throws Exception {
		EmployeeDTO emp = new EmployeeDTO();
		emp.setMobile("789632145");

		Assert.assertNotNull(emp);
		Assert.assertEquals("789632145", emp.getMobile());
		Assert.assertNotEquals("1111111111", emp.getMobile());
	}

	@Test
	public void testGetMail() throws Exception {
		EmployeeDTO emp = new EmployeeDTO();
		emp.setName("TestName");
		emp.setMobile("123456789");
		emp.setMail("test@gmail.com");
		emp.setSalary("1234");

		Assert.assertNotNull(emp);
		Assert.assertEquals("test@gmail.com", emp.getMail());
		Assert.assertNotEquals("demo@gmail.com", emp.getMail());
	}

	@Test
	public void testSetMail() throws Exception {
		EmployeeDTO emp = new EmployeeDTO();
		emp.setMail("demo@gmail.com");

		Assert.assertNotNull(emp);
		Assert.assertEquals("demo@gmail.com", emp.getMail());
		Assert.assertNotEquals("test@gmail.com", emp.getMail());
	}

	@Test
	public void testGetSalary() throws Exception {
		EmployeeDTO emp = new EmployeeDTO();
		emp.setName("TestName");
		emp.setMobile("123456789");
		emp.setMail("test@gmail.com");
		emp.setSalary("1234");

		Assert.assertNotNull(emp);
		Assert.assertEquals("1234", emp.getSalary());
		Assert.assertNotEquals("1111111", emp.getSalary());
	}

	@Test
	public void testSetSalary() throws Exception {
		EmployeeDTO emp = new EmployeeDTO();
		emp.setSalary("12000");

		Assert.assertNotNull(emp);
		Assert.assertEquals("12000", emp.getSalary());
		Assert.assertNotEquals("1111111", emp.getSalary());
	}
	
	@Test
	public void testEmployeeDTO() throws Exception {
		EmployeeDTO emp = new EmployeeDTO("TestName", "123456789", "test@gmail.com", "1234");
		Assert.assertEquals("TestName", emp.getName());
	}

}