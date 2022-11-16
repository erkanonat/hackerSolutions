package solution4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.management.BadAttributeValueExpException;

public class Solution4 {
    
public static void main(String[] args) {
    test();
}

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static void test() {

        int[] myArr = new int[]{2,3,4,5,5};

        Set<Integer> myset = new HashSet<Integer>();
        // List mylist = Arrays.asList(myArr);
        
        for (int val   : myArr) {
            myset.add(val);
        }
        System.out.println(myset.size());

        // int alice =0;
        // int bob=0;
        // for (int i = 0; i < a.size()   ; i++) {
        //     if (a.get(i)>b.get(i))
        //         alice++;
        //     else if (a.get(i)<b.get(i))
        //         bob++;
        //     else 
        //         continue;
        // }

        // r    eturn Arrays.asList(alice,bob);
    }
}
