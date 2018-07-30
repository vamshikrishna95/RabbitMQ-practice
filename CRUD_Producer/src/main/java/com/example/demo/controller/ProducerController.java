package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Bean.EmployeeDTO;
import com.example.demo.producer.ProducerClass;

@RestController
@RequestMapping("/v1")
public class ProducerController {

	@Autowired
	ProducerClass prod;
	
	@PostMapping("/save")
	public String save(@RequestBody EmployeeDTO emp) {
		emp=prod.save(emp);
		return emp.toString();
	}
	
	@GetMapping("/load")
	public String load() {
		prod.load();
		return "Done";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.DELETE)
	public String delete(@RequestBody EmployeeDTO emp) {
		prod.delete(emp);
		return emp.toString();
	}
	
	@PutMapping("/update")
	public String update(@RequestBody EmployeeDTO emp) {
		prod.update(emp);
		return emp.toString();
	}
	
	/*@RabbitListener(queues="loadreturnqueue")
	public String dataReturn(List<EmployeeDTO> dto) {
		for (EmployeeDTO employeeDTO : dto) {
			System.err.println("Received Employee from DataBase: "+employeeDTO);
		}
		return "Received";
	}*/
}
