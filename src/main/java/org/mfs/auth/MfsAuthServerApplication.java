package org.mfs.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "org.mfs.auth" })
public class MfsAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MfsAuthServerApplication.class, args);
	}

}
