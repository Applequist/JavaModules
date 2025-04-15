package org.example.impl;

import org.example.api.GreetService;

class PrivateGreeter implements GreetService {
	public PrivateGreeter() {}

	@Override
	public void greet() {
		System.out.println("Shhhh, hey just pretend I'm not here");
	}
}
