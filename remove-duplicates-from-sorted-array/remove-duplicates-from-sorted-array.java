import java.util.*; 

class Solution {
    public int removeDuplicates(int[] nums) {
        int N = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int n: nums) {
            set.add(n);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int n: set) {
            list.add(n);
        }
        Collections.sort(list);
        int idx = 0;
        for(int n: list) {
            nums[idx] = n;
            idx++;
        }
        return set.size();   
    }
}