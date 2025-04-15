package org.example.app;

import org.example.api.GreetService;
import org.example.impl.RudeGreeter;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
	public static void main(String[] args) {
		GreetService greeter = new RudeGreeter();
		greeter.greet();

        try {
            Constructor<?> defaultCtor = Class.forName("org.example.impl.PrivateGreeter")
                    .getDeclaredConstructor();
            defaultCtor.setAccessible(true);
            GreetService privateGreeter = (GreetService)defaultCtor.newInstance();
            privateGreeter.greet();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
