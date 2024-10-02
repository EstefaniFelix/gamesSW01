package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.controller.model.Plataforma;

public interface PlataformaRepository extends JpaRepository<Plataforma, Long> {
    
} 