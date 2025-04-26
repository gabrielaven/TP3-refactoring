package oop2.tp3.ejercicio4;

import org.jdbi.v3.core.Jdbi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PersonaRepositoryTest {

    private PersonaRepository repo;

    @BeforeEach
    void setUp() {
        Jdbi jdbi = Jdbi.create("jdbc:hsqldb:mem;create=true");
        new SetUpDatabase(jdbi).setUp();
        repo = new PersonaRepository(jdbi);
    }

    @Test
    void buscarPorNombre() {
        List<Persona> personas = repo.buscarPorNombre("Vla");
        assertEquals("Vladimir", personas.get(0).nombre());
    }

    @Test
    void buscarId_existente() {
        Optional<Persona> persona = repo.buscarId(1L);
        assertEquals("José", persona.get().nombre());
    }

    @Test
    void buscarId_noExistente() {
        Optional<Persona> persona = repo.buscarId(99L);
        assertTrue(persona.isEmpty());
    }
}
