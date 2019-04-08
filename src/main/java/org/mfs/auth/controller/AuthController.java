package org.mfs.auth.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

	private static final String WELL_KNOWN_OPENID_ENDPOINT = "/.well-known/openid-configuration";

	@GetMapping("/userinfo")
	public Principal user(Principal user) {
		return user;
	}

	@GetMapping(WELL_KNOWN_OPENID_ENDPOINT)
	public boolean openIdConfig() {
		return true;
	}
}
