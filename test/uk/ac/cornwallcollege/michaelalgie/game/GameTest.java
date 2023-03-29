package uk.ac.cornwallcollege.michaelalgie.game;

import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

public class GameTest {

    @Test
    public void testCharacterCreation() {
        Character c1 = new Character(50, 20, 15, 1, 5, "ZORRO");
    }

    @Test
    public void hitTest() {
        Character c1 = new Character(50, 20, 15, 1, 5, "Zorro");

        Character c2 = new Character(50,0,15, 1, 5, "Sheep");
        c1.Hit(c2);
        assertEquals(35,c2.health);
    }

//    @Test
//    public void testPlayableCharacterCreation() {
//        PlayableCharacter c1 = new Character(100,50,25,2,7,"Super Mario");
//        assertEquals()
//    }
    @Test
    public void TeamRocketCreation() {
        TeamRocket c1 = new TeamRocket(50, 20, 10, 1, 5, "Meowth");
    }

    @Test
    public void TeamRocketHit(){
    TeamRocket c1 = new TeamRocket(50,20,10,1,5, "Meowth");
    TeamRocket c2 = new TeamRocket(50, 0, 10, 1, 5, "Pikachu");
        c1.Hit(c2);
        assertEquals(30, c2.health);
    }

    @Test
    public void CreateMrBlobbly() {
        MrBlobby c1 = new MrBlobby(100, 20, 10, 1, 5, "Mr Blobby");
    }

}