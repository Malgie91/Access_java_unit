package uk.ac.cornwallcollege.michaelalgie.game;

public class BigStick extends Item {
    public BigStick(String name) {
        super(name);
    }

    @Override
    public void Apply(PlayableCharacters c) {
        c.attack += 2;
        c.speed -= 1;
    }
}


