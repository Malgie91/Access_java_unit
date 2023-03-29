package uk.ac.cornwallcollege.michaelalgie.lessons;

import java.util.Arrays;

public class Interest {

//    Main method of program
//    @param args an array of String arguments containing the command line

    public static void main(String[] args) {

        double starting = 1000;
        int rate = 15;

        double[] balance = new double[11]; // sets u an array of 11 items

        balance[0] = starting;
//        loop through the years
        for(int year = 1; year <= 10; year++) { // starting point; conditional(end of loop); increments by 1
            double interest = balance[year-1] * rate / 100.0;
            balance[year] = balance[year-1] + interest;
            System.out.println(balance[year -1]);
        }


//        Now calculate using the formula

        double oneYear = starting * (1.0 + rate/100.0);
        System.out.println(oneYear);
        double twoYears = starting * (1.0 + rate/100.0) * (1.0 + rate/100.0);
        System.out.println(twoYears);
        double tenYears = starting * Math.pow(1.0 + rate/100.0, 10.0);
        System.out.printf("%.2f%n",tenYears);
        System.out.printf("%.2f%n",balance[10]);
    }


}
