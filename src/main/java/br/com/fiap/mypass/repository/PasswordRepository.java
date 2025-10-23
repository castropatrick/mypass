package br.com.fiap.mypass.repository;

import br.com.fiap.mypass.model.PasswordEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasswordRepository extends JpaRepository<PasswordEntry, Long> {}
