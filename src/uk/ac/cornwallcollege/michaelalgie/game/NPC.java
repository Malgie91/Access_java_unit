package uk.ac.cornwallcollege.michaelalgie.game;

public class NPC extends Character {

    public NPC(int health, int defence, int attack, int size, int speed, String name) {
        super(health, defence, attack, size, speed, name);
    }

    @Override
    public String toString() {
        return "you selected a NPC ";
    }
}
