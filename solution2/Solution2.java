package solution2;
import java.util.Arrays;
import java.util.List;

public class Solution2 {

    public static int minimumAbsoluteDifference(List<Integer> arr) {
            //1. sort
            Integer ss[] = new Integer[arr.size()];
            ss = arr.toArray(ss);
            Arrays.sort(ss);

            //2. sliding window
            int min=Integer.MAX_VALUE;
            for(int i=0; i<ss.length-1;i++){
                if(ss[i+1]-ss[i]<min)
                    min =  ss[i+1]-ss[i];

            }

            //3. keep min
            return min;
        }
    

    public static void main(String[] args) {
        Integer[] example = new Integer[]{5,15,7,10};
        System.out.println(minimumAbsoluteDifference(Arrays.asList(example)));
    }

}
