import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[m];
        int[] b = new int[m];

        for(int i =0;i<m;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int res = 0;
        for(int i =0;i<m;i++){
            int temp = 1;
            for(int j=i+1;j<m;j++){
                if((a[i]==a[j] && b[i]==b[j]) || (b[i]==a[j] && a[i]==b[j])){
                    temp++; 
                }
            }
            res = Math.max(res,temp);
        }
        System.out.println(res);

    }
}