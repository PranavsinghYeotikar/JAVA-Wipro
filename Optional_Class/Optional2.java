//ofNullable tried, tried to print a string first by making it empty

import java.util.Optional;
import javax.sound.sampled.SourceDataLine;

public class Optional2 {
    String name = "A";
    public static void main(String[] args) {
        Optional1 emp = new Optional1();
        Optional<String> n = Optional.ofNullable(emp.name);
        n.ifPresent(System.out::println);
    }
}
