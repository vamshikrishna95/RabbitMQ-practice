package com.example.demo;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	ProducerApplicationTest.class,
	com.example.demo.Bean.TestAll.class,
	com.example.demo.controller.TestAll.class,
	com.example.demo.producer.TestAll.class,
})
public class TestAll {
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
