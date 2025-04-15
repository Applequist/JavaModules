package org.example.app;

import org.example.api.GreetService;
import org.example.impl.RudeGreeter;

public class Main {
	public static void main(String[] args) {
		GreetService greeter = new RudeGreeter();
		greeter.greet();
	}
}
