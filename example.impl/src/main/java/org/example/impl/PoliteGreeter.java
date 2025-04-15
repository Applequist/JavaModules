package org.example.impl;

import org.example.api.GreetService;

public class PoliteGreeter implements GreetService {

	@Override
	public void greet() {
		System.out.println("Hello dear friend");
	}
}
