package com.example.demo.consumer;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.example.demo.Bean.EmployeeDTO;
import com.example.demo.repo.EmployeeRepo;

public class ConsumerClassTest {

	@InjectMocks
	ConsumerClass consumerClass;

	@Mock
	EmployeeRepo employeeRepo;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testSave1() throws Exception {
		EmployeeDTO emp = new EmployeeDTO();
		emp.setName("TestName");
		emp.setMobile("123456789");
		emp.setMail("test@gmail.com");
		emp.setSalary("1234");

		Mockito.when(employeeRepo.save(Mockito.isA(EmployeeDTO.class))).thenReturn(emp);
		consumerClass.save(emp);
	}

	@Test
	public void testLoad1() throws Exception {
		List<EmployeeDTO> list = new ArrayList<EmployeeDTO>();

		EmployeeDTO emp = new EmployeeDTO();
		emp.setName("TestName");
		emp.setMobile("123456789");
		emp.setMail("test@gmail.com");
		emp.setSalary("1234");

		list.add(emp);

		Mockito.when(employeeRepo.findAll()).thenReturn(list);
		consumerClass.load("demo");

	}

	/*
	 * @Test public void testLoad_2() throws Exception { ConsumerClass fixture = new
	 * ConsumerClass(); fixture.employeeRepo = null; String msg = "";
	 * 
	 * fixture.load(msg);
	 * 
	 * // add additional test code here // An unexpected exception was thrown in
	 * user code while executing this test: // java.lang.NullPointerException // at
	 * com.example.demo.consumer.ConsumerClass.load(ConsumerClass.java:30) }
	 */

	@Test
	public void testDelete_1() throws Exception {

		EmployeeDTO emp = new EmployeeDTO();
		emp.setName("TestName");
		emp.setMobile("123456789");
		emp.setMail("test@gmail.com");
		emp.setSalary("1234");

		consumerClass.delete(emp);
	}

	@Test
	public void testUpdate_1() throws Exception {
		EmployeeDTO emp = new EmployeeDTO();
		emp.setName("TestName");
		emp.setMobile("123456789");
		emp.setMail("test@gmail.com");
		emp.setSalary("1234");

		Mockito.when(employeeRepo.save(Mockito.isA(EmployeeDTO.class))).thenReturn(emp);
		consumerClass.update(emp);
	}

	@After
	public void tearDown() throws Exception {

	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ConsumerClassTest.class);
	}
}