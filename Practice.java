import java.util.*;

public class Practice{
    public static boolean isStable(int input){
        HashMap<Integer, Integer> map = new HashMap<>();

        while(input > 0){
            int check = input % 10;
            input = input / 10;
            map.put(check, map.getOrDefault(check, 0) + 1);

        }

        Collection<Integer> values = map.values();
        Integer first = values.iterator().next();

        for(Integer val : values){
            if(!first.equals(val)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int input1 = 455;
        int input2 = 257;
        int input3 = 3300;
        int input4 = 110;
        int input5 = 303;

        int stable = 0;
        int unstable = 0;

       if(isStable(input1)){
        stable += input1;
       } 
       else{
        unstable += input1;
       }

       if(isStable(input2)){
        stable += input2;
       } 
       else{
        unstable += input2;
       }

       if(isStable(input3)){
        stable += input3;
       } 
       else{
        unstable += input3;
       }

       if(isStable(input4)){
        stable += input4;
       } 
       else{
        unstable += input4;
       }

       if(isStable(input5)){
        stable += input5;
       } 
       else{
        unstable += input5;
       }

       int pass = stable - unstable;
       System.out.println(pass);
    }

    
}