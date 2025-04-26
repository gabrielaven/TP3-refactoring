package oop2.tp3.ejercicio4;

import java.util.Optional;

import org.jdbi.v3.core.Jdbi;

public class Main {

    public static void main(String[] args) {

        Jdbi jdbi = Jdbi.create("jdbc:hsqldb:mem;create=true");

        new SetUpDatabase(jdbi).setUp();

        var repo = new PersonaRepository(jdbi);
        var personas = repo.buscarPorNombre("Vla");

            for (Persona persona : personas) {
                System.out.println(persona.nombre() + " " + persona.apellido());

        }

            Optional<Persona> resultado = repo.buscarId(1L);

            if (resultado.isPresent()) {
                Persona p = resultado.get();
                System.out.println(p.nombre() + " " + p.apellido());
            }
    }
}
