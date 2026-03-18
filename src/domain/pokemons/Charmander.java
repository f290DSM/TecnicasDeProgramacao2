package domain.pokemons;

public class Charmander extends Pokemon {
        
    public Charmander(String nick, Integer cp, Integer hp) {
        super(nick, cp, hp);
    }

    public void ambar() {
        System.out.println("Charmander usou Ambar!");
    }

    @Override
    public void attack() {
        System.out.println("Charmander usou Attack!");
    }
}
