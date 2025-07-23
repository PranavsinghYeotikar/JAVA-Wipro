public class String6 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();
        String a = "Prana";

        sb.append(a);
        int n = sb.length();

        if(n%2 == 0){
            sb1.append(sb.substring(0, n/2));
            System.out.println(sb1);
        }
        else{
            System.out.println("null");
        }
    }
}
