import java.util.ArrayList;
import java.util.List;

import domain.pokemons.Charmander;
import domain.pokemons.EletricType;
import domain.pokemons.FireType;
import domain.pokemons.FlyingType;
import domain.pokemons.Pikachu;
import domain.pokemons.Pokemon;
import domain.pokemons.Raichu;
import domain.pokemons.WaterType;
import domain.pokemons.Zapdos;

public class App {
    public static void main(String[] args) throws Exception {
        var pikachu = new Pikachu("Pikachu", 1000, 800);
        System.out.println(pikachu);

        var zapdos = new Zapdos("Zapdos", 2000, 1500);
        System.out.println(zapdos);

        var raichu = new Raichu("Raichu", 2500, 2000);
        System.out.println(raichu);

        var charmander = new Charmander("Charmander", 2000, 1800);
        System.out.println(charmander);

        // Polimorfismo
        List<Pokemon> pokedex = new ArrayList<>();
        pokedex.add(pikachu);
        pokedex.add(zapdos);
        pokedex.add(charmander);
        pokedex.add(raichu);

        String template = "%s.\n Detalhes de Herança e Polimorfismo:\n"
                + "\t instância de Object: %b\n"
                + "\t instância de Pokemon: %b\n"
                + "\t instância de FireType: %b\n"
                + "\t instância de EletricType: %b\n"
                + "\t instância de FlyingType: %b\n"
                + "\t instância de WaterType: %b\n\n";

        for (Pokemon pokemon : pokedex) {
            if (!(pokemon instanceof FireType)) continue;
    
            System.out.println(String.format(
                    template,
                    pokemon.getClass().getSimpleName(),
                    pokemon instanceof Object,
                    pokemon instanceof Pokemon,
                    pokemon instanceof FireType,
                    pokemon instanceof EletricType,
                    pokemon instanceof FlyingType,
                    pokemon instanceof WaterType));
            pokemon.attack();
        }
    }
}
