package uk.ac.cornwallcollege.michaelalgie.game;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
//        Character c1 = new Character(10, 5, 4, 1, 2, "Zorro");
//        System.out.println(c1.toString());
//        Character c2 = new PlayableCharacters(5, 6, 7, 8, 3, "Safdari");
//        System.out.println(c2);
//        Character c3 = new NPC(1,2,3,4,5,"Joe Hill");
//        System.out.println(c3);
//        Character c4 = new TeamRocket(1,2,3,4,54,"Jesse");
//        System.out.println(c4);

        Scanner scan = new Scanner(System.in);
        System.out.println("Please select first Character\n1 for a playable character\n2 for a NPC\n3 for Team Rocket");
        int choice = scan.nextInt();
        Character c1;
        switch (choice) {
            case 1:
                c1 = new PlayableCharacters(5,6,7,8,9,"Safdari");
                break;
            case 2:
                c1 = new NPC(5,6,7,8,9,"Joe Hill");
                break;
            case 3:
                c1 = new TeamRocket(5,6,7,8,9,"Rockets");
                break;
            default:
                c1 = new NPC(1,2,3,4,5,"Joe Hill");
        }
        System.out.println("the first character is" + c1);

    }
}
