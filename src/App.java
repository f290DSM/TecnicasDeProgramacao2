import java.util.Collections;

import domain.Curso;
import domain.Professor;
import domain.pokemons.Pikachu;
import domain.pokemons.Pokemon;

public class App {
    public static void main(String[] args) throws Exception {
        var pikachu = new Pikachu("Pikachu", 100, 100);
        System.out.println(pikachu);
        pikachu.thunderbolt();

    }
}
