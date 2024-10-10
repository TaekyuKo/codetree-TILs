import java.util.*;

public class Main {
    public static int[] dx = new int[]{1,0,-1,0}; //E S W N
    public static int[] dy = new int[]{0,1,0,-1};
    public static final Scanner sc = new Scanner(System.in);
    public static int n = sc.nextInt();
    
    public static int[][] grid = new int[n][n];
    public static int[][] visited = new int[n][n];
    public static int[] group = new int[n*n/2];
    public static int num = 0;

    public static boolean inRange(int y, int x, int n){
        return(y>=0 && y<n && x>=0 && x<n);
    }

    public static boolean canGo(int y, int x, int n){
        if(inRange(y,x,n)==false){
            return false;
        }
        if(grid[y][x] == 0 || visited[y][x] ==1){
            return false;
        }
        return true;
    }

    public static void DFS(int y, int x){

        for(int i = 0;i<4;i++){
            int ny = y + dy[i];
            int nx = x + dx[i];
            
            if(canGo(ny,nx,n)){

                group[num]++;
                visited[ny][nx] = 1;
                DFS(ny,nx);
            }
        }
        
    }

    public static void main(String[] args) {
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                grid[i][j] = sc.nextInt();
            }
        }

        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j]!=0 && visited[i][j]!=1){
                    visited[i][j] = 1;
                    group[num]++;
                    DFS(i,j);
                    num++;
                }
            }
        }

        int cnt = 0;
        for(int i = 0;i<group.length;i++){
            if(group[i]!=0){
                cnt++;
            }
        }

        System.out.println(cnt);

        int[] result = new int[cnt];
        for(int i =0;i<cnt;i++){
            result[i] = group[i];
        }
        Arrays.sort(result);
        for(int i = 0;i<result.length;i++){
            System.out.println(result[i]);
        }

        

    }
}