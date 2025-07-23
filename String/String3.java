// pallindrome check
public class String3 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        String a = "HelleH";

        sb1.append(a);
        sb2.append(sb1.reverse());

        if((sb1.toString()).equals((sb2.toString()))){
            System.out.println("It is a pallindrome");
            System.out.println(sb1);
            System.out.println(sb2);
        }
        else{
            System.out.println("No it is not");
            System.out.println(sb1);
            System.out.println(sb2);
        }
        
        
    }
}
