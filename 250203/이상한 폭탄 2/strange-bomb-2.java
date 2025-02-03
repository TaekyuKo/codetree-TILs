import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bom = new int[n];
        for(int i =0;i<n;i++){
            bom[i] = sc.nextInt();
        }

        int res = -1;
        for(int i = 0;i<n;i++){
            int temp = -1;
            for(int j = i+1;j<n;j++){
                if(bom[i] == bom[j] && j-i<=k){
                    temp = bom[i];
                }
            }
            res = Math.max(res,temp);
        }

        System.out.println(res);
    }
}