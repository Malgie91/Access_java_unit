package uk.ac.cornwallcollege.michaelalgie.game;

public class Character {
    int health;
    int defence;
    int attack;
    int size;
    int speed;
    String name;

    public Character(int health, int defence, int attack, int size, int speed, String name) {
        this.health = health;
        this.defence = defence;
        this.attack = attack;
        this.size = size;
        this.speed = speed;
        this.name = name;
    }

    public void Hit(Character c) {
        int rnd = (int)(Math.random()*10); // random number from 0 to 9
        if (rnd + c.attack > c.defence) {
            System.out.println(name + " Attacked the "  + c.name + " Successfully");
            dealDamage(c, size * attack);
        } else {
            System.out.println(name + " Misses " + c.name);
        }
    }

    @Override
    public String toString() {
        return "Character{" + "\n" +
                "health= " + health + ",\n" +
                "defence= " + defence + ",\n" +
                "attack= " + attack + ",\n" +
                "size= " + size + ",\n" +
                "speed= " + speed + ",\n" +
                "name= " + name + "\n" + '}';
    }

    public void dealDamage(Character c, int amount) {
        c.health -= amount;
    }
}
