package org.example.app;

import org.example.api.GreetService;
import java.util.ServiceLoader;

public class Main {
	public static void main(String[] args) {
		ServiceLoader.load(GreetService.class).forEach(g -> g.greet());
	}
}
