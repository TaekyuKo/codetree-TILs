import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0;i<n;i++){
            num[i] = sc.nextInt();
        }

        int res = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            num[i] *=2;

            for(int j = 0;j<n;j++){
                int cnt = 0;
                int[] rem = new int[n-1];
                for(int k = 0;k<n;k++){
                    if(k != j){
                        rem[cnt++] = num[k];
                    }
                }
                int sum = 0;
                for(int k = 0;k<n-2;k++){
                    sum+=Math.abs(rem[k+1]-rem[k]);
                }
                res = Math.min(res,sum);
            }
            num[i]/=2;
        }
        System.out.println(res);
    }
}