package uk.ac.cornwallcollege.michaelalgie.lessons;

public class createMethods {

//  How to create a method

    /*
          - Access Modifier i.e. public(can be accessed across the application ) /
            private (can only be used within its class)
          - Optional static
          - return Type ie void(does not return) / int(integer) String.
          - Name (Name of method avoid reserved words)
          - Optional parameters i.e. expected input inside ().
          - Method body // anything contained inside the {}
          - Optional return value // i.e return result

    */

//    let's create a method that adds two numbers together

    private static int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    private static String hail(String fname) {
        String result = " Hail!! " + fname;
        return result;
    }


    public static void main(String[] args) {
//        call the methods in here
        int result1 = add(32,34);
        int result2 = add(12,12);
        System.out.println(result1);
        System.out.println(result2);

        String yourName = hail("Mike");
        System.out.println(yourName);
    }

}
