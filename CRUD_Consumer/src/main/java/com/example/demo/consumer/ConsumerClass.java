package com.example.demo.consumer;

import java.util.List;

//import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Bean.EmployeeDTO;
import com.example.demo.repo.EmployeeRepo;

@Service
public class ConsumerClass {

	/*@Autowired
	AmqpTemplate amqpTemplate;*/
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@RabbitListener(queues="savequeue")
	public void save(EmployeeDTO emp) {
		//System.err.println("Received Employee from Postman: "+emp.toString());
		employeeRepo.save(emp);
	}
	
	@RabbitListener(queues="loadqueue")
	public void load(String msg) {
		List<EmployeeDTO> list=employeeRepo.findAll();
		for (EmployeeDTO employeeDTO : list) {
			System.err.println("Received Employee from DataBase: "+employeeDTO);
		}
		//amqpTemplate.convertAndSend("employee", "loadreturnkey", list);
	}
	
	@RabbitListener(queues="deletequeue")
	public void delete(EmployeeDTO emp) {
		System.err.println("Received Employee from Postman: "+emp.toString());
		employeeRepo.delete(emp);
	}
	
	@RabbitListener(queues="updatequeue")
	public void update(EmployeeDTO emp) {
		System.err.println("Received Employee from Postman: "+emp.toString());
		emp=employeeRepo.save(emp);
	}
}
