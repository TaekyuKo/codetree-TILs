import java.util.*;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static int n = sc.nextInt();
    public static int m = sc.nextInt();

    public static int[][] graph = new int[n+1][n+1];
    public static int[] visited = new int[n+1];

    public static void DFS(int vertex){
        for(int j = 1;j<=n;j++){
            if((graph[vertex][j]==1 || graph[j][vertex]==1) && visited[j]==0){
                visited[j] = 1;
                DFS(j);
            }
        }
    }
    public static void main(String[] args) {
        visited[1] = 1;

        for(int i = 0;i<m;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = 1;
        }

        DFS(1);
        int DFS_cnt = 0;

        for(int i = 2;i<=n;i++){
            if(visited[i]==1){
                DFS_cnt++;
            }
        }

        System.out.print(DFS_cnt);

        
    }
}