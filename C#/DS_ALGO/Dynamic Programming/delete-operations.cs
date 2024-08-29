public class Solution {
    public int MinDistance(string word1, string word2) {
        int[,] dp = new int[word1.Length+1,word2.Length+1];
        for (int i = 0; i <= word1.Length; i++)
        {
            for (int j = 0; j <= word2.Length; j++)
            {
                dp[i, j] = -1;
            }
        }
        int lcsRes = lcs(word1, word2, word1.Length, word2.Length, dp);
        Console.WriteLine(lcsRes);
        return (word1.Length - lcsRes) + (word2.Length - lcsRes);
    }
    
    public int lcs(string X, string Y, int m, int n, int [,] L) {
        if (m == 0 || n == 0)
            return 0;
 
        if (L[m, n] != -1)
            return L[m, n];
 
        if (X[m - 1] == Y[n - 1]) {
            L[m, n] = 1 + lcs(X, Y, m - 1, n - 1, L);
            return L[m, n];
        }
 
        L[m, n] = Math.Max(lcs(X, Y, m, n - 1, L), lcs(X, Y, m - 1, n, L));
        return L[m, n];
    }
}
