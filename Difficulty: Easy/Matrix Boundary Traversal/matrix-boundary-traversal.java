class Solution {
    static ArrayList<Integer> boundaryTraversal(int mat[][]) {
        ArrayList<Integer> in = new ArrayList<>();
        int n = mat.length, m = mat[0].length;

        if (n == 1) {
            for (int i = 0; i < m; i++) in.add(mat[0][i]);
        }
        else if (m == 1) {
            for (int i = 0; i < n; i++) in.add(mat[i][0]);
        }
        else {
            for(int i=0;i<m;i++) in.add(mat[0][i]);
            
            for(int i=1;i<n;i++) in.add(mat[i][n-1]);
            
            for(int i=m-2;i>=0;i--) in.add(mat[m-1][i]);
            
            for(int i=n-2;i>=1;i--) in.add(mat[i][0]);
}
        return in;
    }
}
