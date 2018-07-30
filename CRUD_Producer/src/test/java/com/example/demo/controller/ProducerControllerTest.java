package com.example.demo.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.doNothing;

import org.junit.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import com.example.demo.Bean.EmployeeDTO;
import com.example.demo.producer.ProducerClass;

public class ProducerControllerTest {

	@InjectMocks
	ProducerController producerController;
	
	@Mock
	ProducerClass prod;
	
	@Test
	public void testSave() throws Exception {
		EmployeeDTO employeeDTO=new EmployeeDTO();
		employeeDTO.setName("TestName");
		employeeDTO.setMobile("123456789");
		employeeDTO.setMail("test@gmail.com");
		employeeDTO.setSalary("1234");
		
		Mockito.when(prod.save(Mockito.isA(EmployeeDTO.class))).thenReturn(employeeDTO);
		assertNotNull(employeeDTO);
		assertNotEquals("Name", employeeDTO.getName());
		assertEquals("123456789", employeeDTO.getMobile());
		producerController.save(employeeDTO);
	}
	
	@Test
	public void testDelete() throws Exception {
		EmployeeDTO employeeDTO=new EmployeeDTO();
		employeeDTO.setName("TestName");
		employeeDTO.setMobile("123456789");
		employeeDTO.setMail("test@gmail.com");
		employeeDTO.setSalary("1234");
		
		Mockito.when(prod.delete(Mockito.isA(EmployeeDTO.class))).thenReturn(employeeDTO);
		assertNotNull(employeeDTO);
		assertNotEquals("Name", employeeDTO.getName());
		assertEquals("123456789", employeeDTO.getMobile());
		producerController.delete(employeeDTO);
		
	}

	@Test
	public void testLoad() throws Exception {
		doNothing().when(prod).load();
		producerController.load();
	}

	@Test
	public void testUpdate() throws Exception {
		EmployeeDTO employeeDTO=new EmployeeDTO();
		employeeDTO.setName("TestName");
		employeeDTO.setMobile("123456789");
		employeeDTO.setMail("test@gmail.com");
		employeeDTO.setSalary("1234");
		
		Mockito.when(prod.update(Mockito.isA(EmployeeDTO.class))).thenReturn(employeeDTO);
		assertNotNull(employeeDTO);
		assertNotEquals("Name", employeeDTO.getName());
		assertEquals("123456789", employeeDTO.getMobile());
		producerController.update(employeeDTO);
	}

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@After
	public void tearDown() throws Exception {
		
	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ProducerControllerTest.class);
	}
}