package uk.ac.cornwallcollege.michaelalgie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class hello {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        List<String> myList2 = new ArrayList<>();


        myList.add("Michael Algie");
        myList.add("Emil Bostrom");
        myList.add("Theo James");
        myList.add("Zach Lad");

        for (var s : myList) {
           Name fullName = new Name(s);
           String reversed = fullName.reverseOrder();
           String initials = fullName.getInitial();
           myList2.add(reversed);
           System.out.println(initials);
        }

        Collections.sort(myList2);
        for (var i : myList2) {
            System.out.println(i);
        }



    }
}
