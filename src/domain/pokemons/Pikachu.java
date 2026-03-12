package domain.pokemons;

public class Pikachu extends Pokemon implements EletricType {
    public Pikachu(String nick, Integer cp, Integer hp) {
        super(nick, cp, hp);
    }

    @Override
    public void thunderbolt() {
        System.out.println("Pikachu usou Thunderbolt!");
    }
}
