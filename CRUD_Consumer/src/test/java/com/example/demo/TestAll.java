package com.example.demo;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	ConsumerApplicationTest.class,
	com.example.demo.Bean.TestAll.class,
	com.example.demo.consumer.TestAll.class,
})
public class TestAll {
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
