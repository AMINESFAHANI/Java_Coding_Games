import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountLetters {


    /**
     * Auto-generated code below aims at helping you parse
     * the standard input according to the problem statement.
     **/


        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            String string = in.nextLine();
            string=string.toLowerCase().replaceAll("\\s","");
            System.out.println(string);
            Map<Character,Integer> map= new LinkedHashMap<>();
            for (char x:string.toCharArray()){
                int c=0;
                if(!map.containsKey(x)){
                    for (char y:string.toCharArray()){
                        if(y==x) c++;
                    }
                map.put(x,c);
                }

            }


            System.out.println(map);
        }
    }

