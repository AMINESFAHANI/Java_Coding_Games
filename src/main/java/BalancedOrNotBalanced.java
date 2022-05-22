import java.util.Scanner;

public class BalancedOrNotBalanced {
    /*
Given an expression string exp,
write a program to examine whether the pairs and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in exp.

Example:

Input: exp = “[()]{}{[()()]()}”
Output: Balanced

Input: exp = “[(])”
Output: Not Balanced

     */

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String exp = in.nextLine();
        int b=0,p=0,bb=0;
        String answer="Balanced";
        for (char x:exp.toCharArray()){
            if(x=='{') bb++;
            else if (x=='}') bb-=1;
            else if (x=='(') p++;
            else if (x==')') p-=1;
            else if (x=='[') b++;
            else b-=1;
            if (b<0 || p<0 || bb<0) { answer="Not Balanced"; break;}
            }
        if (b!=0 || p!=0 || bb!=0)  answer="Not Balanced";
        System.out.println(answer);
    }
        }

