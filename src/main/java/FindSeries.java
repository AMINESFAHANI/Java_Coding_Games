/*
 	Goal
You have a digital lock which can be opened typing a series of K digits from 0 - 9.
You can also type any digits before or after any member of the K digits,
the lock will open after typing each digit of K at least once in order.

Print yes or no whether the given T digits opens the lock.
*/


import java.util.Scanner;

public class FindSeries {
String k;
String T;
int n;
boolean test;
int i=0;
    public boolean checkSeris(String K){
        Scanner in = new Scanner(System.in);
        i=0;
        T= in.nextLine();
        if (T==null)return false;
        for (char x :k.toCharArray()){
            test=false;
            while (i!= T.length()){
                if(x==T.toCharArray()[i]){
                    i++;
                    test=true;
                    break;
                }else {
                    i++;
                }
            }
        }
     return test;
    }
    public static void main(String args[]){
        FindSeries obj = new FindSeries();
        Scanner in = new Scanner(System.in);
        obj.k= in.nextLine();
        obj.n=in.nextInt();

        for (int j=0;j< obj.n;j++){
            System.out.println(obj.checkSeris(obj.k));

        }
    }
}
