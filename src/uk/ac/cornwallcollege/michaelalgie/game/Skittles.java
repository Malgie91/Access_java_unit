package uk.ac.cornwallcollege.michaelalgie.game;

public class Skittles extends Item {
    public Skittles(String name) {
        super(name);
    }

    @Override
    public void Apply(PlayableCharacters c) {
        c.speed += 1;
    }
}
