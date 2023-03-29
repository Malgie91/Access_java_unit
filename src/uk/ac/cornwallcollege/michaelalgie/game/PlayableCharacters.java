package uk.ac.cornwallcollege.michaelalgie.game;

public class PlayableCharacters extends Character {
    String mood;
    int experience;


    public PlayableCharacters(int health, int defence, int attack, int size, int speed, String name) {
        super(health, defence, attack, size, speed, name);
    }
}
