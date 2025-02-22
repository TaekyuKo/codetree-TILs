import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] num = new int[n+1];
        for(int i = 1;i<=n;i++){
            num[i] = sc.nextInt();
        }

        int res_max = 0;
        for(int i =1;i<=n;i++){
            int temp = 0;
            int point = i;
            for(int j =0;j<m;j++){
                temp+=num[point];
                point = num[point];
            }
            res_max = Math.max(res_max,temp);
        }

        System.out.println(res_max);
        
    }
}