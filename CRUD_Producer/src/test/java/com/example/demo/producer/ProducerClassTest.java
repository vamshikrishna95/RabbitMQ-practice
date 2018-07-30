package com.example.demo.producer;

import static org.mockito.Mockito.doNothing;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.amqp.core.AmqpTemplate;

import com.example.demo.Bean.EmployeeDTO;

public class ProducerClassTest {

	@InjectMocks
	ProducerClass producerClass;

	@Mock
	AmqpTemplate amqpTemplate;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testSave() throws Exception {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setName("TestName");
		employeeDTO.setMobile("123456789");
		employeeDTO.setMail("test@gmail.com");
		employeeDTO.setSalary("1234");
		doNothing().when(amqpTemplate).convertAndSend(Mockito.isA(String.class), Mockito.isA(String.class), Mockito.isA(EmployeeDTO.class));
		producerClass.save(employeeDTO);

	}

	@Test
	public void testLoad() throws Exception {
		doNothing().when(amqpTemplate).convertAndSend(Mockito.isA(String.class), Mockito.isA(String.class), Mockito.isA(String.class));
		producerClass.load();
	}

	@Test
	public void testDelete() throws Exception {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setName("TestName");
		employeeDTO.setMobile("123456789");
		employeeDTO.setMail("test@gmail.com");
		employeeDTO.setSalary("1234");

		doNothing().when(amqpTemplate).convertAndSend(Mockito.isA(String.class), Mockito.isA(String.class), Mockito.isA(EmployeeDTO.class));
		producerClass.delete(employeeDTO);
	}

	
	@Test
	public void testUpdate_1() throws Exception {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setName("TestName");
		employeeDTO.setMobile("123456789");
		employeeDTO.setMail("test@gmail.com");
		employeeDTO.setSalary("1234");

		doNothing().when(amqpTemplate).convertAndSend(Mockito.isA(String.class), Mockito.isA(String.class), Mockito.isA(EmployeeDTO.class));
		producerClass.update(employeeDTO);
	}

	@After
	public void tearDown() throws Exception {

	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ProducerClassTest.class);
	}
}