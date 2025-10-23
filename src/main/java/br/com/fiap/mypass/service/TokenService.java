package br.com.fiap.mypass.service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

    private final JwtEncoder jwtEncoder;

    TokenService(JwtEncoder jwtEncoder) {
        this.jwtEncoder = jwtEncoder;
    }

    public String generateToken(String username) {
        var claims = JwtClaimsSet.builder()
            .expiresAt(Instant.now().plus(5, ChronoUnit.MINUTES))
            .subject(username)
            .issuedAt(Instant.now())
            .claim("role", "SPY")
            .build();

        return  jwtEncoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();

    }
    
}