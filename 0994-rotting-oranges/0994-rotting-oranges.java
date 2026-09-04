class Solution {
    
    public class Triplet{
        int row;
        int col;
        int time;
        Triplet(int row, int col, int time){
            this.row= row;
            this.col=col;
            this.time= time;
        }
    }
    public int orangesRotting(int[][] grid) {
        int c=0;
        int n = grid.length;
        int m =grid[0].length;

        Queue<Triplet> q= new LinkedList<>();
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {  // rotton
                    q.add(new Triplet(i, j, 0));
                }
            }
        }
            int maxtime=0;
            while(q.size()>0){
                Triplet front = q.remove();
                int row= front.row;
                int col= front.col;
                int time= front.time;

                maxtime= Math.max(maxtime, time);
                // goint left -> row, col-1
                if(col-1>=0 && grid[row][col-1]==1 ){
                    grid[row][col-1]=2;
                    q.add(new Triplet(row, col-1, time+1));
                }
                // going right -> row, col+1
                if(col+1<m && grid[row][col+1]==1 ){
                    grid[row][col+1]=2;
                    q.add(new Triplet(row, col+1, time+1));
                }
                // going up -> row-1, col
                if(row-1>=0 && grid[row-1][col]==1 ){
                    grid[row-1][col]=2;
                    q.add(new Triplet(row-1, col, time+1));
                }
                // going down -> row+1, col
                if(row+1<n && grid[row+1][col]==1 ){
                    grid[row+1][col]=2;
                    q.add(new Triplet(row+1, col, time+1));
                }
            }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1) return -1;
            }
        }
        return maxtime;
    }
}
