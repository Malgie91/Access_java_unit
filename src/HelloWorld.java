public class HelloWorld {
    /**
     * The main method
     * @param args command line arguments
     * **/

    public static void main(String[] args){


        System.out.println("Hello World!");

        String[] count = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        for(int i = 1; i < 11; i++) {
            System.out.println(count[i]);
        }

        System.out.println("Hooray I can count to 10!!");
    }
}


