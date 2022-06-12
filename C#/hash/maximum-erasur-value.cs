public class Solution {
    public int MaximumUniqueSubarray(int[] nums) {
        var hash = new Dictionary<int, int>();
        int start = 0;
        int maxSum = 0;
        int curSum = 0;
        int length = nums.Length;
        
        for(int end = 0; end < length; end++) {
            if(!hash.ContainsKey(nums[end])) {
                curSum += nums[end];
                hash.Add(nums[end], end);
            } else {
                if(hash[nums[end]] >= start) {
                    if(curSum > maxSum) maxSum = curSum;
                    while(start <= hash[nums[end]]) {
                        curSum -= nums[start];
                        start++;
                    }
                }
                curSum += nums[end];
                hash[nums[end]] = end;
            }
        }
        if(curSum > maxSum) return curSum;
        
        return maxSum;
    }
}