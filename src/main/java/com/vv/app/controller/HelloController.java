package com.vv.app.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vv.app.model.Greeting;

@RestController("hello")
public class HelloController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/entrar")
	public String entrar() {
		return "vc entrou!";
	}

	@RequestMapping("/sair")
	public String sair() {
		return "vc saiu!";
	}
	
	@RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

}
