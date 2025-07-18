import java.util.Scanner;

public class Encapsulation {
    public class Author{
        private String name;
        private String email;
        private char Gender;

        Author(String name, String email, char Gender){
            this.name = name;
            this.email = email;
            this.Gender = Gender;
        }

        public void setAuthor(){

        }
    }

    public class Book{
        private String name;
        private String email;
        private double price;
        private int qtyInStock;

        Book(String name, String email, double price, int qtyInStock){
            this.name = name;
            this.email = email;
            this.price = price;
            this.qtyInStock = qtyInStock;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Encapsulation encap = new Encapsulation();


        System.out.println("Enter the name of the author: ");
        String authName = sc.next();
        System.out.println("Enter the email of the author: ");
        String authEmail = sc.next();
        System.out.println("Enter the name of the author: ");
        char gender = sc.next().charAt(0);

        Encapsulation.Author auth = encap.new Author(authName, authEmail, gender);

        System.out.println("Enter the name of the book: ");
        String bookName = sc.next();
        System.out.println("Enter the price of the book: ");
        double bookPrice = sc.nextDouble();
        System.out.println("Enter the quantity of the book: ");
        int bookQty = sc.nextInt();

        Encapsulation.Book book = encap.new Book(bookName, authName, bookPrice, bookQty);
    }
    
}






//! simple technique to do it
// public class Encapsulation{
//     public static class Author{
//         public void someFunc1(){

//         }
//     }
//     public static class Book{
//         public void someFunc2(){
            
//         }
//     }

//     public static void main(String[] args) {
//         Author auth = new Author();
//         Book book = new Book();
//         auth.someFunc1();
//         book.someFunc2();
//     }
// }


//! if you dont want to use static
// public class Encapsulation{
//     public class Author{
//         public void someFunc1(){

//         }
//     }
//     public class Book{
//         public void someFunc2(){
            
//         }
//     }

//     public static void main(String[] args) {
//         Encapsulation encap = new Encapsulation();
//         Encapsulation.Author auth = encap.new Author();
//         Encapsulation.Book book = encap.new Book();
//         auth.someFunc1();
//         book.someFunc2();
//     }
// }