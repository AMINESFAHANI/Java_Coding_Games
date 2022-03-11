/*
Given a sequence like [1, 2, 3, 4, 5], and an array of sub sequences like [[1,2], [3, 4],
[5]], return True or False if the given sequence could be constructed from given sub
sequences. The selected sub sequences would concatenate to construct exactly the
given sequence.
Example test cases:
(1). CanConstruct([1, 2, 3, 4, 5], [[1, 2], [3, 4], [5]]) == True
(2). CanConstruct([1, 3, 4, 5, 2], [[2, 3], [1, 3], [4, 2], [2], [4,
5]]) == True
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConcatenateSubsequances {
    ArrayList<Integer> sequance = new ArrayList<Integer>();
    ArrayList<ArrayList<Integer>> subSequances = new ArrayList<ArrayList<Integer>>();
    int i=0;
    boolean resault = false;

    public boolean sequanceConstructor( int i){
        if (!resault){
            for (int j=i+1;j<sequance.size()+1;j++){
                if(subSequances.contains(sequance.subList(i,j))){
                    if (j==sequance.size()){
                        resault=true;
                    }else {
                        sequanceConstructor(j);
                    }
                }

            }
        }
        return resault;

    }
    public static void main (String args[]){
        ConcatenateSubsequances obj =new ConcatenateSubsequances();
        Collections.addAll(obj.sequance,1,2,3,4,5);
        ArrayList<Integer> a= new ArrayList<Integer>();
        ArrayList<Integer> b= new ArrayList<Integer>();
        ArrayList<Integer> c= new ArrayList<Integer>();
        ArrayList<Integer> d= new ArrayList<Integer>();

        Collections.addAll(a,1,2);
        Collections.addAll(b,3);
        Collections.addAll(c,3,4,9);
        Collections.addAll(d,5);
        Collections.addAll(obj.subSequances,a,b,c,d);

        System.out.print(obj.sequanceConstructor(obj.i));
    }
}
