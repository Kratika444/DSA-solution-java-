class Solution {
    public class Pair {
        int row;
        int col;

        Pair(int row, int col){
            this.row= row;
            this.col=col;
        }
    }

    public int numEnclaves(int[][] grid) {
       
        int n = grid.length;
        int m =grid[0].length;

        Queue<Pair> q= new LinkedList<>();

        for(int j=0;j<m;j++){
            if(grid[0][j]==1){
                grid[0][j]=-1;
                q.add(new Pair(0,j));
            }
            if(grid[n-1][j]==1){
                grid[n-1][j]=-1;
                q.add(new Pair(n-1,j));
            }
        }
         for(int i=0;i<n;i++){
            if(grid[i][0]==1){
                grid[i][0]=-1;
                q.add(new Pair(i,0));
            }
            if(grid[i][m-1]==1){
                grid[i][m-1]=-1;
                q.add(new Pair(i,m-1));
            }
        }
            while(q.size()>0){
                Pair front = q.remove();
                int row= front.row;
                int col= front.col;
                
                // going left -> row, col-1
                if(col-1>=0 && grid[row][col-1]==1 ){
                    grid[row][col-1]=-1;
                    q.add(new Pair(row, col-1));
                }
                // going right -> row, col+1
                if(col+1<m && grid[row][col+1]==1 ){
                    grid[row][col+1]=-1;
                    q.add(new Pair(row, col+1));
                }
                // going up -> row-1, col
                if(row-1>=0 && grid[row-1][col]==1 ){
                    grid[row-1][col]=-1;
                    q.add(new Pair(row-1, col));
                }
                // going down -> row+1, col
                if(row+1<n && grid[row+1][col]==1 ){
                    grid[row+1][col]=-1;
                    q.add(new Pair(row+1, col));
                }
            }
            int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1) count++;
            }
        }
        return count;
    }
}