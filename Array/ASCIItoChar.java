public class ASCIItoChar {
    public static void main(String[] args) {
        int[] asciiValues = {65, 76, 89, 98, 123};
        char[] character = new char[asciiValues.length];
        for (int i = 0; i < asciiValues.length; i++) {
            character[i] = (char) asciiValues[i];
        }
        System.out.println("Your ascii values are: ");
        for (int i = 0; i < asciiValues.length; i++) {
            System.out.print(asciiValues[i] + " ");
        }
        System.out.println();
        System.out.println("Your charecters are: ");
        for (int i = 0; i < character.length; i++) {
            System.out.print(character[i] + " ");
        }
    }
}
