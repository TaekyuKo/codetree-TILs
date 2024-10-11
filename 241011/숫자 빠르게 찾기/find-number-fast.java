import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] num = new int[n];
        for(int i = 0;i<n;i++){
            num[i] = sc.nextInt();
        }

        for(int i =0;i<m;i++){
            int k = sc.nextInt();

            int left = 0;
            int right = n-1;

            int idx = -1;
            while(left<=right){
                int mid = (left+right)/2;
                if(num[mid] == k){
                    idx = mid+1;
                    break;
                }
                
                if(num[mid]>k){
                    right = mid-1;
                }else{
                    left = mid+1;
                }

            }

            System.out.println(idx);
        }

    }
}