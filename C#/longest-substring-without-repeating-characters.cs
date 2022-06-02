public class Solution {
    public int LengthOfLongestSubstring(string s) {
        var hash = new Dictionary<char, int>();
        int longest = 0;
        int tempLength = 0;
        int first = 0;
        for(int i=0 ; i<s.Length ; i++) {
            if(hash.ContainsKey(s[i])) {
                if(hash[s[i]] > first)
                    first = hash[s[i]];
                if(tempLength > longest) {
                    longest = tempLength;
                }
                tempLength = i - first;
                hash[s[i]] = i;
            } else {
                tempLength++;
                hash[s[i]] = i;
            }
        }
        if(tempLength > longest) {
            longest = tempLength;
        }
        return longest;
    }
}