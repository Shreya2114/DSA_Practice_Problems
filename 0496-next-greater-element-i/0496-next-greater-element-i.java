class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[nums1.length];
        for (int i = 0; i < n; i++) {
        int nextGreater = -1;
        boolean found = false;
        for (int j = 0; j < m; j++) {
            if (nums1[i] == nums2[j]) {
                found = true;
            }
            if (found && nums2[j] > nums1[i]) {
                nextGreater = nums2[j];
                break;
            }
        }
        ans[i] = nextGreater;
    }
    
        return ans;
    }
}