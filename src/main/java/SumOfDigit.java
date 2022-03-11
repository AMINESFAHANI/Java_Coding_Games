/*
Given an integer n, repeatedly sum up all of the digits until the result has only 1 digit left.
Return the number you end up with.
*/



import java.util.*;
import java.io.*;
import java.math.*;

public class SumOfDigit  {

        public int sumOfDigit() {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            return sum(n);
        }

        public static int sum(int n){
            if(n/10 != 0){
                int sum=0;
                char[] s=Integer.toString(n).toCharArray();
                for (char x : s){
                    String Y= Character.toString(x);
                    sum += Integer.parseInt(Y);
                }
                return sum(sum);
            }
            else {
                return n;
            }
        }
}

