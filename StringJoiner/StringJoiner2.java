//add() method

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoiner2 {
    public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner(",", "{", "}");
        ArrayList<String> s2 = new ArrayList<String>();
        s2.add("Football");
        s2.add("Cricket");
        s2.add("Chess");
        s2.forEach(element -> s1.add(element));
        System.out.println();
    }
}
