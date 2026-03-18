package domain.pokemons;

public class Squartle extends Pokemon implements WaterType{

    public Squartle(String nick, Integer cp, Integer hp) {
        super(nick, cp, hp);
    }

    @Override
    public void attack() {
        splash();
    }

    @Override
    public void splash() {
        System.out.println("Squartle usou Splash!");
    }
    
}
