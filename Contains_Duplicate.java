import java.util.*;
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> myList = new HashSet<>(); 
        for (int i = 0; i < nums.length; i++) {
            myList.add(nums[i]);
        }
       
        return nums.length > myList.size();
    }
}
public void main(String[] args){
    Solution s = new Solution();
    int[] nums = {1,2,3,4,5,5};
    System.out.println(s.hasDuplicate(nums)); 
}
