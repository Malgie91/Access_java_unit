package uk.ac.cornwallcollege.michaelalgie;

public class Name {
    String first;
    String last;

    String fIn;
    String lIn;


//    Constructor !!!
    public Name(String s) {
        int pos = s.indexOf(' ');
        first = s.substring(0,pos);
        last = s.substring(pos+1);
    }
    public String reverseOrder() {
        return last + " " + first;
    }

    @Override
    public String toString() {
        return first + " " + last;
    }
    public String getInitial() {
        return first.substring(0,1) + last.substring(0,1);
     }
}


