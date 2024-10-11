import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] type = new int[n];
        for(int i = 0;i<n;i++){
            type[i] = sc.nextInt();
        }

        int cnt = 0;
        int idx = n-1;
        while(k != 0){
            if(type[idx]<=k){
                k -= type[idx];
                cnt++;
            }else{
                idx--;
            }
        }

        System.out.println(cnt);
    }
}