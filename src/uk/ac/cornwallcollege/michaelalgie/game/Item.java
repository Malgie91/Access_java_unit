package uk.ac.cornwallcollege.michaelalgie.game;

public abstract class Item {
    String name;

    public Item(String name) {
        this.name = name;
    }


    public abstract void Apply(PlayableCharacters c);
}