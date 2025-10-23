package br.com.fiap.mypass.service;

import java.util.List;
import org.springframework.stereotype.Service;
import br.com.fiap.mypass.repository.PasswordRepository;
import br.com.fiap.mypass.model.PasswordEntry;

@Service
public class PasswordService {

    private final PasswordRepository passwordRepository;

    public PasswordService(PasswordRepository passwordRepository) {
        this.passwordRepository = passwordRepository;
    }

    public List<PasswordEntry> getAllPasswords() {
        return passwordRepository.findAll();
    }
}
