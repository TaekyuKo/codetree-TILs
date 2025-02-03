import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        int[] p = new int[n];
        int[] s = new int[n];
        for(int i = 0;i<n;i++){
            p[i] = sc.nextInt();
            s[i] = sc.nextInt();
        }

        int res = 0;
        for(int i = 0;i<n;i++){
            int max_num = 0;
            for(int j = 0;j<n;j++){
                if(j==i){
                    p[i]/=2;
                }
            }
            int temp_b = b;
            for(int k = 0;k<n;k++){
                if(temp_b-(p[k]+s[k])>=0){
                    temp_b -= (p[k]+s[k]);
                    continue;
                }else{
                    max_num = k;
                    break;
                }
            }
            res = Math.max(res,max_num);
            p[i]*=2;
        }
        System.out.println(res);

    }
}