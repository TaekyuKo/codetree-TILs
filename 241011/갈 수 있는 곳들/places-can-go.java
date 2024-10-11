import java.util.*;

class Pair{
    int y,x;
    public Pair(int y, int x){
        this.y = y;
        this.x = x;
    }
}

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static int n = sc.nextInt();

    public static Queue<Pair> q= new LinkedList<>();
    public static int[][] grid = new int[n][n];
    public static int[][] visited = new int[n][n];
    public static int num = 0;

    public static boolean inRange(int y, int x){
        return (y>=0 && y<n && x>=0 && x<n);
    }

    public static boolean canGo(int y, int x){
        if(!inRange(y,x)){
            return false;
        }
        if(grid[y][x]==1 || visited[y][x]==1){
            return false;
        }
        return true;
    }

    public static void push(int y , int x){
        num++;
        visited[y][x] = 1;
        q.add(new Pair(y,x));
    }

    public static void BFS(){
        int[] dy = new int[]{0,1,0,-1};
        int[] dx = new int[]{1,0,-1,0};

        while(!q.isEmpty()){
            Pair curr = q.poll();
            int y = curr.y;
            int x=  curr.x;

            for(int i = 0;i<4;i++){
                int ny = y + dy[i];
                int nx = x + dx[i];

                if(canGo(ny,nx)){
                    push(ny,nx);
                }
            }
        }

    }

    public static void main(String[] args) {
        int k = sc.nextInt();

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                grid[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i<k;i++){
            int y = sc.nextInt();
            int x = sc.nextInt();
            if(visited[y-1][x-1]!=1){
                push(y-1,x-1);
                BFS();
            }


        }

        System.out.println(num);


    }
}