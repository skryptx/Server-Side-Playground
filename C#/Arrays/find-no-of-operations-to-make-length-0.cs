public class Solution {
    public int RemovePalindromeSub(string s) {
        bool flagA = s.Contains('a');
        bool flagB = s.Contains('b');
        
        if(flagA && flagB && !IsPalindrome(s)) {
            return 2;
        } else {
            return 1;
        }
    }
    
    public bool IsPalindrome(string s) {
        int lastIndex = s.Length - 1;
        for(int i=0; i<lastIndex; i++, lastIndex--) {
            if(s[i] != s[lastIndex]) {
                return false;
            }
        }
        return true;
    }
}