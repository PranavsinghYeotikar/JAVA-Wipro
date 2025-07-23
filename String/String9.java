public class String9 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        String a = "x3hei3giHix";

        sb.append(a);

        int n = sb.length();

        if((sb.charAt(0)) == 'x' && (sb.charAt(n-1)) == 'x'){
            sb.deleteCharAt(n-1);
            sb.deleteCharAt(0);
            System.out.println(sb);
        }
        else{
            System.out.println(sb);
        }
        
    }
}
