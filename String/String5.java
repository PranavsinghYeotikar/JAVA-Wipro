public class String5 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        String a = "wjbjdicbiwebc";
        
        sb.append(a);
        int n = (a.length()) - 1;

        sb2.append(sb.substring(0, 2));
        sb.setLength(0);

        for (int i = 0; i < n; i++) {
            sb.append(sb2);
        }
        System.out.println(sb);
    }
}
