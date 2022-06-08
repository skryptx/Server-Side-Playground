public class Solution {
    public int RearrangeCharacters(string s, string target) {
        var hash = new Dictionary<char, int>();
        var hashTarget = new Dictionary<char, int>();
        var min = Int32.MaxValue;
        
        foreach(var ch in s) {
            if(hash.ContainsKey(ch)) {
                hash[ch]++;
            } else {
                hash[ch] = 1;
            }
        }
        
        foreach(var ch in target) {
            if(hashTarget.ContainsKey(ch)) {
                hashTarget[ch]++;
            } else {
                hashTarget[ch] = 1;
            }
        }
        
        foreach(var ch in target) {
            if(!hash.ContainsKey(ch) || !hashTarget.ContainsKey(ch)) {
                return 0;
            }
            int temp = hash[ch]/hashTarget[ch];
            if(temp < min) {
                min = temp;
            }
        }
        return min;
    }
}