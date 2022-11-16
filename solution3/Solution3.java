import java.util.List;

class Solution3 {

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum=0;
            for (Integer value : ar) {
                sum += value;
            }
        return sum;
    }
    

    public static void main(String[] args) {
        
    }

}