/*
Product of Digits of Sum
        Create a function that takes one, two or more numbers as arguments and adds them together to get a new number.
        The function then repeatedly multiplies the digits of the new number by each other, yielding anew number, until the product is only 1 digit long.
        Return the final product.
        Examples:
<code>sumDigProd(16, 28) ➞ 6</code><code>// 16 + 28 = 44
</code><code>// 4 * 4 = 16</code><code>// 1 * 6 = 6
</code><code>sumDigProd(0) ➞ 0
</code><code>sumDigProd(1, 2, 3, 4, 5, 6) ➞ 2</code>
*/
public class ProductOfDigitsOfSum {

    public int productOfDigitsOfSum(int...numbers){
        int s=0;
        for (int x :numbers){
            s+=x;
        }
        
        while (s/10!=0){
            int p=1;
            while (s!=0){
                p*=(s%10);
                s/=10;
            }
            s=p;
        }
        return s;
    }

}
