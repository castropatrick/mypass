package br.com.fiap.mypass.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.mypass.service.TokenService;

@RestController
public class AuthController {

    private final TokenService tokenService;

    public record TokenResponse(String token) {}

    public AuthController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @PostMapping("/login")
    public TokenResponse login(Authentication authentication) {
        var token = tokenService.generateToken(authentication.getName());
        return new TokenResponse(token);
    }
}
