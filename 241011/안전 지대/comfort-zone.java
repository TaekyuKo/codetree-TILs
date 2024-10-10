import java.util.*;

public class Main {
    public static int[] dx = new int[]{1,0,-1,0};
    public static int[] dy = new int[]{0,1,0,-1};

    public static final Scanner sc = new Scanner(System.in);

    public static int n = sc.nextInt();
    public static int m = sc.nextInt();

    public static int[][] grid = new int[n][m];
    public static int[][] visited = new int[n][m];

    public static boolean inRange(int y, int x){
        return (y>=0 && y<n && x>=0 && x<m);
    }

    public static boolean canGo(int y, int x){
        if(!inRange(y,x)){
            return false;
        }
        if(grid[y][x]==0 || visited[y][x]==1){
            return false;
        }
        return true;
    }

    public static void DFS(int y, int x){
        for(int i = 0;i<4;i++){
            int ny = y + dy[i];
            int nx = x + dx[i];

            if(canGo(ny,nx)){
                visited[ny][nx] = 1;
                DFS(ny,nx);
            }
        }
    }

    public static void main(String[] args) {
        for(int i =0;i<n;i++){
            for(int j = 0;j<m;j++){
                grid[i][j] = sc.nextInt();
            }
        }


        int maxcnt = 0;
        int res = 1;
        
        for(int k = 1;k<=100;k++){
            for(int i = 0;i<n;i++){
                for(int j = 0;j<m;j++){
                    if(grid[i][j]<=k){
                        grid[i][j] = 0;
                    }
                }
            }

            int num = 0;
            for(int i = 0;i<n;i++){
                for(int j = 0;j<m;j++){
                    if(grid[i][j]!=0 && visited[i][j]!=1){
                        visited[i][j] = 1;
                        DFS(i,j);
                        num++;
                    }
                }
            }

            if(maxcnt<num){
                maxcnt = num;
                res = k;
            }

            for(int i = 0;i<n;i++){
                for(int j = 0;j<m;j++){
                    visited[i][j] = 0;
                }
            }

        }



        System.out.print(res+" "+maxcnt);
        


    }
}