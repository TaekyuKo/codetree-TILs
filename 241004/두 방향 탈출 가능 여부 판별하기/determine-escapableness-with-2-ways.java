import java.util.*;

public class Main {
    public static int[] dx = new int[]{0,1};
    public static int[] dy = new int[]{1,0};

    public static final Scanner sc = new Scanner(System.in);
    public static int n = sc.nextInt();
    public static int m = sc.nextInt();

    public static int[][] grid = new int[n][m];
    public static int[][] answer = new int[n][m];
    public static int[][] visited = new int[n][m];

    public static boolean isRange(int y, int x, int n, int m){
        return (y>=0 && y<n && x>=0 && x<m);
    }

    public static boolean canGo(int y, int x,int n, int m){
        if(isRange(y,x,n,m) == false){
            return false;
        }
        if(visited[y][x]==1 || grid[y][x] == 0){
            return false;
        }
        return true;
    }

    public static void DFS(int y, int x){
        for(int i = 0;i<2;i++){
            int newY = y + dy[i];
            int newX = x + dx[i];

            if(canGo(newY,newX,n,m)){
                answer[newY][newX] = 1;
                visited[newY][newX] = 1;
                DFS(newY,newX);
            }
        }
    }




    public static void main(String[] args) {
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                grid[i][j] = sc.nextInt();
            }
        }

        int y = 0;
        int x = 0;
        answer[y][x] = 1;
        visited[y][x] = 1;
        DFS(y,x);

        if(answer[n-1][m-1]==1){
            System.out.print(1);
        }else{
            System.out.print(0);
        }

    }
}