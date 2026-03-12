package domain.pokemons;

public class Raichu extends Pokemon implements EletricType {
    
    public Raichu(String nick, Integer cp, Integer hp) {
        super(nick, cp, hp);
    }

    @Override
    public void thunderbolt() {
        System.out.println("Raichu usou Thunderbolt!");
    }
}
