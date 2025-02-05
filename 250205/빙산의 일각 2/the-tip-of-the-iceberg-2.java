import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n+1];
        int max = 0;
        for(int i = 0;i<n;i++){
            h[i] = sc.nextInt();
            max = Math.max(max,h[i]);
        }
        h[n] = 0;

        int res = 0;
        for(int i = 0;i<=max;i++){
            int temp = 0;
            for(int j = 0;j<n;j++){
                if(h[j]-i>0 && h[j+1]-i<=0){
                    temp++;
                }
            }

            res = Math.max(res,temp);
        }

        System.out.println(res);




    }
}