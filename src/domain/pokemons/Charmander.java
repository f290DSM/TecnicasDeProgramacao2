package domain.pokemons;

public class Charmander extends Pokemon implements FireType {
        
    public Charmander(String nick, Integer cp, Integer hp) {
        super(nick, cp, hp);
    }

    public void ambar() {
        System.out.println("Charmander usou Ambar!");
    }

    @Override
    public void attack() {
        amber();
    }

    @Override
    public void amber() {
        System.out.println("Charmander usou Amber!");
    }
}
