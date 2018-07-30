package com.example.demo.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Bean.EmployeeDTO;

@Component
public class ProducerClass {

	@Autowired
	AmqpTemplate amqpTemplate;
	
	public EmployeeDTO save(EmployeeDTO emp) {
		amqpTemplate.convertAndSend("employee", "savekey", emp);
		System.out.println("Saved Employee: "+emp.toString());
		return emp;
	}
	
	public void load() {
		amqpTemplate.convertAndSend("employee", "loadkey", "load");
		System.out.println("Employee Loaded");
	}

	public EmployeeDTO delete(EmployeeDTO emp) {
		amqpTemplate.convertAndSend("employee", "deletekey", emp);
		System.out.println("Deleted Employee: "+emp.toString());
		return emp;
	}

	public EmployeeDTO update(EmployeeDTO emp) {
		amqpTemplate.convertAndSend("employee", "updatekey", emp);
		System.out.println("Updated Employee: "+emp.toString());
		return emp;
	}
	
}
