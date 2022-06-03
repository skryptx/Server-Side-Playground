public class NumMatrix {
    
    int [][] matrix;

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
        for(int i=0; i<matrix.Length; i++) {
            int sum = 0;
            for(int j=0; j<matrix[i].Length; j++) {
                sum += matrix[i][j];
                matrix[i][j] = sum;
            }
        }
    }
    
    public int SumRegion(int row1, int col1, int row2, int col2) {
        
        int sum = 0;
        for(int i=row1; i<=row2; i++) {
            if(col1 - 1 >= 0) {
                sum += matrix[i][col2] - matrix[i][col1 - 1];
            } else {
                sum += matrix[i][col2];
            }
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.SumRegion(row1,col1,row2,col2);
 */