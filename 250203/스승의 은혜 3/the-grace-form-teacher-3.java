import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        int[] p = new int[n];
        int[] s = new int[n];
        int[] sum = new int[n];
        for(int i = 0;i<n;i++){
            p[i] = sc.nextInt();
            s[i] = sc.nextInt();
            sum[i] = p[i]+s[i];
        }
        Arrays.sort(sum);
        Arrays.sort(s);
        Arrays.sort(p);

        int res = 0;
        for(int i = 0;i<n;i++){
            int temp_b = b;
            int cnt = 0;
            for(int j = 0;j<n;j++){
                if(j==i){
                    p[i]/=2;
                }

                if(temp_b-(p[j]+s[j])>=0){
                    temp_b -= (p[j]+s[j]);
                    cnt++;
                }else{
                    break;
                }
            }
            res = Math.max(res,cnt);
            p[i]*=2;
        }

        System.out.println(res);

    }
}