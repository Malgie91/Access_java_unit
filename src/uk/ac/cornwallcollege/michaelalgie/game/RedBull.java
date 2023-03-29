package uk.ac.cornwallcollege.michaelalgie.game;

public class RedBull extends Item {
    public RedBull(String name) {
        super(name);
    }

    @Override
    public void Apply(PlayableCharacters c) {
        c.attack += 1;
        c.defence += 1;
        c.speed += 2;
        c.mood = "Buzzing";
        c.health -= 1;
    }
}
