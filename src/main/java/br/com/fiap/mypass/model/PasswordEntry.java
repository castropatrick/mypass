package br.com.fiap.mypass.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class PasswordEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String serviceName;
    private String username;
    private String encryptedPassword;
}
