public class String7 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();

        String name = "Pranav";

        sb.append(name);
        int n = sb.length() - 1;

        sb1.append(sb.substring(1, (n)));
        System.out.println(sb1);
    }
}
