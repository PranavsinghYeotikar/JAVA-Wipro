import java.util.StringJoiner;

public class StringJoiner1{
    public static void main(String args[]){
        StringJoiner s1 = new StringJoiner(",");
        s1.add("A");
        s1.add("B");
        System.out.println(s1);
    }
}