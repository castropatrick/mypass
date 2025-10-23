package br.com.fiap.mypass.controller;

import br.com.fiap.mypass.model.PasswordEntry;
import br.com.fiap.mypass.repository.PasswordRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passwords")
public class PasswordController {

    private final PasswordRepository repository;

    public PasswordController(PasswordRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<PasswordEntry> findAll() {
        return repository.findAll();
    }


}
