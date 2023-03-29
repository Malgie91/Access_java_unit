package uk.ac.cornwallcollege.michaelalgie.game;

public class TeamRocket extends NPC {
    public TeamRocket(int health, int defence, int attack, int size, int speed, String name) {
        super(health, defence, attack, size, speed, name);

    }

    @Override
    public String toString() {
        return "TeamRocket is go";
    }

    @Override
    public void dealDamage(Character c, int amount) {
        c.health -= attack;
        c.health -= attack;
    }
}

