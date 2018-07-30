package com.example.demo;

import org.junit.*;

public class ConsumerApplicationTest {

	@Test
	public void testMain_1() throws Exception {
		String[] args = new String[] {};
		ConsumerApplication.main(args);
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ConsumerApplicationTest.class);
	}
}