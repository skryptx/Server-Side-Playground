public class Solution {
    public int MinimumTotal(IList<IList<int>> triangle) {
        var visited = new Dictionary<string, int>();
        int min = DBMinHelper(triangle, 0, 0, visited);
        return min;
    }
    
    public int DBMinHelper(IList<IList<int>> triangle, int level, int i, Dictionary<string, int> visited) {
        if(level == triangle.Count) {
            return 0;
        }
        
        string key = String.Join(',', new int[] {level, i});
        
        if(visited.ContainsKey(key)) {
            return visited[key];
        }
        
        int firstVal = triangle[level][i] + DBMinHelper(triangle, level+1, i, visited);
        int secondVal = triangle[level][i] + DBMinHelper(triangle, level+1, i + 1, visited);
        if(firstVal < secondVal) {
            visited[key] = firstVal;
            return firstVal;
        } 
        
        visited[key] = secondVal;
        return secondVal;
    }
}