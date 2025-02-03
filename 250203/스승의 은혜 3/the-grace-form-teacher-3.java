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
                if(i==j){
                    p[i]/=2;
                }
                int temp_b = b;
                for(int k = 0;k<n;k++){
                    if(temp_b-(p[i]+s[i])>=0){
                        temp_b -= (p[i]+s[i]);
                        continue;
                    }else{
                        max_num = k;
                        break;
                    }
                }
            }
            res = Math.max(res,max_num);
        }
        System.out.println(res);

    }
}