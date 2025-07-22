import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Creating a new LinkedList of Integers
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);

        list.addFirst(5); 
        list.addLast(40);
        list.add(1, 20);

        list.remove(2);
        list.remove(Integer.valueOf(20));

         list.set(1, 15);

        // Printing the list
        System.out.println("LinkedList: " + list);
    }
}
