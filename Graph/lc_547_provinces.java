package Graph;

public class lc_547_provinces {
     static void dfs(int city, int[][] isConnected,boolean[] vis){
        vis[city]=true;
        for(int n=0;n<isConnected.length;n++){
            if(isConnected[city][n]==1 && !vis[n]){
                dfs(n,isConnected,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] vis= new boolean[n];
        int p=0;
        for(int i=0;i<n;i++){
            if(!vis[i]){
                p++;
                dfs(i,isConnected,vis);
            }
        }
        return p;
    }
}
