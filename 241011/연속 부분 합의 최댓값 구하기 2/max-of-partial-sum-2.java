import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int maxsum = -1000;

        for(int i = 0;i<n;i++){
            if(arr[i]<0){
                sum = 0;
                continue;
            }
            sum+=arr[i];
            maxsum = Math.max(maxsum, sum);
        }

        if(maxsum == -1000){
            int maxmi = -1000;
            for(int i = 0;i<n;i++){
                maxmi = Math.max(maxmi,arr[i]);
            }
            maxsum = maxmi;
        }

        



        System.out.println(maxsum);


    }
}