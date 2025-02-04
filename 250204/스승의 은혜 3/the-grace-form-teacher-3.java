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
        



        int res = 0;
        for(int i = 0;i<n;i++){
            int cnt = 1; 
            int temp_b = b - (p[i]/2 + s[i]);
            
            if(temp_b < 0){
                continue; 
            } 
            
            int[] temp_sum = sum.clone(); 
            temp_sum[i] = Integer.MAX_VALUE; 
            Arrays.sort(temp_sum);
            
            for(int j = 0;j<n-1;j++){  
                if(temp_b-temp_sum[j]>=0){
                    temp_b -= temp_sum[j];
                    cnt++;
                }else{
                    break;
                }
            }
            res = Math.max(res,cnt);
        }

        System.out.println(res);

    }
}