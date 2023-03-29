package uk.ac.cornwallcollege.michaelalgie.game;

public class Stick extends Item {
    public Stick(String name) {
        super(name);
    }

    @Override
    public void Apply(PlayableCharacters c) {
        c.attack += 1;
    }
}
