import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int c = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();

        int[] ta = new int[n];
        int[] tb = new int[n];
        for(int i =0;i<n;i++){
            ta[i] = sc.nextInt();
            tb[i] = sc.nextInt();
        }

        int tot = 0;
        for(int i = 0;i<=1000;i++){
            int temp_max = 0;
            for(int j = 0;j<n;j++){
                if(i<ta[j]){
                    temp_max+=c;
                }else if(i>=ta[j] && i<=tb[j]){
                    temp_max+=g;
                }else{
                    temp_max+=h;
                }
            }
            tot = Math.max(tot,temp_max);
        }

        System.out.println(tot);


    }
}