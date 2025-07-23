public class String8 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();

        String first = "Haa";
        String second = "Haa";

        sb.append(first);
        sb2.append(second);

        if(sb.length() < sb2.length()){
            sb.append(sb2);
            sb.append(first);
            System.out.println(sb);
        }
        else if(sb.length() == sb2.length()){
            System.out.println("You entered strings of same length");
        }
        else{
            sb2.append(sb);
            sb2.append(second);
            System.out.println(sb2);
        }
    }
}
