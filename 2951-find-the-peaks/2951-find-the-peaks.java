import java.util.*;

class Solution {
    public List<Integer> findPeaks(int[] nums) {

        int i = 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (i <= nums.length - 2) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                list.add(i);
                i += 2;
            } else {
                i++;
            }
        }

        return list;
    }
}