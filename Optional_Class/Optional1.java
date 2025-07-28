//ofNullable tried, tried to print a string first by making it empty

import java.util.Optional;

public class Optional1 {
    String name = "A";
    public static void main(String[] args) {
        Optional1 emp = new Optional1();
        Optional<String> n = Optional.ofNullable(emp.name);
        System.out.println(n.get());
    }
}
