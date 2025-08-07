import java.util.ArrayList;
import java.util.HashSet;

public class Practice {
    static class Rectangle{
        int length;
        int width;
        int height;

        public Rectangle(int length, int width, int height) {
            this.length = length;
            this.width = width;
            this.height = height;
        }

        public int volumeCalc(){
            int volume = length*width*height;
            return volume;
        }
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(2,3,4);
        int res = rect.volumeCalc();
        System.out.println(res);
    }
}
