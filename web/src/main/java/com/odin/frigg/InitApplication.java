package com.odin.frigg;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitApplication implements CommandLineRunner {

	public void run(String... args) throws Exception {
		System.setProperty("host", IPUtils.getLocalHostLANAddress());
	}

}
