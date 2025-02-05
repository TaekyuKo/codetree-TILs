import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
            max = Math.max(max,a[i]);
            min = Math.min(min,a[i]);
        }

        int res = 0;
        for(int k =min;k<=max;k++){
            int temp_max = 0;
            for(int i =0;i<n-1;i++){
                for(int j = i+1;j<n;j++){
                    if(a[j]-k == k-a[i]){
                        temp_max++;
                    }    
                }
            }
            res = Math.max(res, temp_max);

        }
        System.out.println(res);

    }
}