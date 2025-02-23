import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        boolean res = true;
        int min = 0;
        for(int x =1;x<=1000;x++){
            int dou = x*2;
            for(int i = 0;i<n;i++){
                if(dou>=a[i] && dou<=b[i]){
                    dou*=2;
                    continue;
                }else{
                    res = false;
                }
            }

            if(res == true){
                min = x;
                break;
            }
            res = true;
            
        }
        System.out.println(min);

    }
}