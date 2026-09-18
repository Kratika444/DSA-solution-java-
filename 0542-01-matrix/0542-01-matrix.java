 public class Pair{
        int row;
        int col;

        Pair(int row, int col){
            this.row=row;
            this.col=col;
        }
    }
class Solution {
    public int[][] updateMatrix(int[][] grid) {
 
    
        // ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        int n =grid.length;
        int m =grid[0].length;
        Queue<Pair> q= new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    q.add(new Pair(i,j));
                }
            }
        }

        int ans2[][]= new int[n][m];
        while(q.size()>0){
            Pair front= q.remove();
            int row= front.row;
            int col= front.col;
            if(col-1 >=0 && grid[row][col-1]==1 && ans2[row][col-1]==0){
                ans2[row][col-1]= ans2[row][col] + 1 ;
                q.add(new Pair(row, col-1));
            }
            if(col+1 <m && grid[row][col+1]==1 && ans2[row][col+1]==0){
                ans2[row][col+1]= ans2[row][col] + 1 ;
                q.add(new Pair(row, col+1));
            }
            if(row-1 >=0 && grid[row-1][col]==1 && ans2[row-1][col]==0){
                ans2[row-1][col]= ans2[row][col] + 1 ;
                q.add(new Pair(row-1, col));
            }
            if(row+1 <n && grid[row+1][col]==1 && ans2[row+1][col]==0){
                ans2[row+1][col]= ans2[row][col] + 1 ;
                q.add(new Pair(row+1, col));
            }
        }

        // for(int i=0;i<n;i++){
        //     ArrayList<Integer> a= new ArrayList<>();
        //     for(int j=0;j<m;j++){
        //        a.add(ans2[i][j]);
        //     }
        //     ans.add(a);
        // }
        return ans2;
    }
}