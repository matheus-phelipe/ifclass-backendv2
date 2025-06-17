package com.ifclass.ifclass.usuario.repository;

import com.ifclass.ifclass.usuario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);

    Optional<Usuario> findByProntuario(String prontuario);
}

