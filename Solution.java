import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.table.TableRowSorter;

class Solution {

    public static void main(String[] args) {
        int target=7;
        int[] nums = new int[]{9,5,3,2,1};
        int[] result = (twoSum(nums,target));
        for (int i : result) {
            System.out.println(i);
        }
        
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(nums[i])) {
                return new int[] { prevMap.get(num), i };
            }

            prevMap.put(diff, i);
        }

        return new int[] {};
    }
}
