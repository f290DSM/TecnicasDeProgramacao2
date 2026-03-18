package domain.pokemons;

public class Blaziken extends Pokemon implements FireType {
    
    public Blaziken(String nick, Integer cp, Integer hp) {
        super(nick, cp, hp);
    }

    @Override
    public void attack() {
        ember();
    }

    @Override
    public void ember() {
        System.out.println("Blaziken usou Ember!");
    }
    
}
