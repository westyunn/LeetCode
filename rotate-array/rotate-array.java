class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length; // -1. -100, 3, 99 n=4 k=2 -> 3 99 -1 -100
        int[] copy = new int[n];
        for(int i=0; i<n; i++) {
            copy[i] = nums[i];
        }
        for(int i=0; i<n; i++) {
            int tmp = copy[i];
            nums[(i+k) % n] = tmp; // k=3n=7 /// 0->3 1->4 / 2->5 3->6 4->0 5->1 6->2
        }
        for(int nm: nums) {
            System.out.print(nm+" ");
        }
    }
}