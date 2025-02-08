import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }

        int res = 0;
        for(int i =1;i<=3;i++){
            int dol = i;
            int temp_cnt = 0;
            for(int j = 0;j<n;j++){
                if(a[j]==dol){
                    dol = b[j];
                }else if(b[j]==dol){
                    dol = a[j];
                }else{
                    //
                }

                if(c[j]==dol){
                    temp_cnt++;
                }
            }

            res = Math.max(res,temp_cnt);
        }

        System.out.println(res);
    }
}