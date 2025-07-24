
import java.util.StringJoiner;

public class StringJoiner3{
    public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner(",", "[", "]");
        StringJoiner s2 = new StringJoiner(",", "(", ")");

        s1.add("A");
        s1.add("B");
        s2.add("1");
        s2.add("2");

        System.out.println(s1);
        s1.merge(s2);
    }
}