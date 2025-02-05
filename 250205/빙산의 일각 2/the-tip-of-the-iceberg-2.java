import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int max = 0;
        for(int i = 0;i<n;i++){
            h[i] = sc.nextInt();
            max = Math.max(max,h[i]);
        }

        int res = 0;
        for(int i = 0;i<=max;i++){
            int temp = 0;
            for(int j = 0;j<n-1;j++){
                if(h[j]-i>0 && h[j+1]-i<=0){
                    temp++;
                }
            }
            if(h[n-1]>0){
                temp++;
            }
            res = Math.max(res,temp);
        }

        System.out.println(res);




    }
}