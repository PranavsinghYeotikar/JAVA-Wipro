import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList aList = new ArrayList();

        // adding
        aList.add("1");
        aList.add("2");
        aList.add("3");

        ListIterator listIterator = aList.listIterator();
        System.out.println("Previous index is "+ listIterator.previousIndex());
        System.out.println("Next Index is " + listIterator.nextIndex());
        listIterator.next();
        System.out.println("After inreasing current position by one element :");
        System.out.println("Previous index is " + listIterator.previousIndex());
        System.out.println("Next Index is " + listIterator.nextIndex());
    }
}