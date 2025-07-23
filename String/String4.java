public class String4 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();

        String name = "Pranav";
        String lastname = "Yeotikar";

        sb1.append(name);
        sb2.append(lastname);

        sb1 = new StringBuffer(sb1.toString().toLowerCase());
        sb2 = new StringBuffer(sb2.toString().toLowerCase());

        int nameN = sb1.length();
        int lastN = sb2.length();

        if(sb1.charAt(nameN - 1) == sb2.charAt(0)){
            sb1.append(sb2.substring(1, lastN));
            System.out.println(sb1);
        }
        else{
            sb1.append(sb2);
            System.out.println(sb1);
        }
    }
}
