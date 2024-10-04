import java.util.*;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static int n = sc.nextInt();
    public static int m = sc.nextInt();

    public static int[][] graph = new int[n+1][n+1];
    public static int[] visited = new int[n+1];

    public static void DFS(int vertex, int m){
        for(int i = 1;i<=m;i++){
            if(graph[vertex][i]==1 && visited[i]==0){
                visited[i] = 1;
                DFS(i,m);
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

        for(int i = 1;i<=n;i++){
            DFS(i,m);
        }

        int DFS_cnt = 0;

        for(int i = 2;i<=n;i++){
            if(visited[i]==1){
                DFS_cnt++;
            }
        }

        System.out.print(DFS_cnt);

        
    }
}