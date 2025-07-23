public class String2{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer();
        String surname = "yeotikar";
        String lastname = "pranav";
        sb.append(surname);
        System.out.println(surname);
        int n = surname.length();
        sb.insert(n, lastname);
        System.out.println("Full Name: " + sb);
        System.out.println("In reverse: " + sb.reverse());
    }
}