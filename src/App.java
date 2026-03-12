import java.util.Collections;

import domain.Curso;
import domain.Professor;
import domain.pokemons.Pikachu;
import domain.pokemons.Pokemon;

public class App {
    public static void main(String[] args) throws Exception {
        Professor p1 = new Professor(Collections.emptyList());
        Curso dsm = new Curso();
        dsm.nome = "Desenvolvimento de Software Multiplataforma";
        p1.ensinar(dsm);

        var pikachu = new Pikachu();
        pikachu.thunderbolt();
        pikachu.

    }
}
