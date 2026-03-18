package domain.pokemons;

public class Blaziken extends Pokemon implements FireType {
    
    public Blaziken(String nick, Integer cp, Integer hp) {
        super(nick, cp, hp);
    }

    @Override
    public void attack() {
        amber();
    }

    @Override
    public void amber() {
        System.out.println("Blaziken usou Ember!");
    }
    
}
