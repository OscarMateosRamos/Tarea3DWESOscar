package com.Tarea3DWESOscar.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Tarea3DWESOscar.modelo.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

	List<Persona> findByEmail(String email);

}
