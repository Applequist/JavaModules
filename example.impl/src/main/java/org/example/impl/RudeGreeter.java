package org.example.impl;

import org.example.api.GreetService;
 
public class RudeGreeter implements GreetService {

	@Override
	public void greet() {
		System.out.println("Hey shit face!");
	}

}
