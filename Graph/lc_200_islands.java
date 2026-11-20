package Graph;

import java.util.Queue;

public class lc_200_islands {
     public int numIslands(char[][] grid) {
        int count=0;
        int row=grid.length;
        int col=grid[0].length;
        Queue<int[]> q= new LinkedList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    count++;
                    
                    q.add(new int[]{i,j});
                    grid[i][j]='0';
                    while(!q.isEmpty()){
                        int[] curr=q.poll();
                        int r=curr[0];
                        int c=curr[1];
                        if(r>0 && grid[r-1][c]=='1'){
                            q.add(new int[]{r-1,c});
                            grid[r-1][c]='0';
                        }
                        if(r<row-1 && grid[r+1][c]=='1'){
                            q.add(new int[]{r+1,c});
                        grid[r+1][c]='0';
                        }
                        if(c>0 && grid[r][c-1]=='1'){
                            q.add(new int[]{r,c-1});
                            grid[r][c-1]='0';
                        }
                        if(c<col-1 && grid[r][c+1]=='1'){
                            q.add(new int[]{r,c+1});
                            grid[r][c+1]='0';
                        }
                    }

                    }
            }
        }
            return count;
    }
}
