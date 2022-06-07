public class Solution {
    public void Merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        for(int i = n - 1; i>=0 ; i--) {
            index = 0;
            for(int j = m - 1; j>=0; j--) {
                if(nums2[i] > nums1[j]) {
                    index = j+1;
                    break;
                }
                nums1[j+1] = nums1[j];
            }
            nums1[index] = nums2[i];
            m++;
        }
    }
}