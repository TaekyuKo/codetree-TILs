import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();

        char[] c = new char[t];
        int[] x = new int[t];
        for(int i = 0;i<t;i++){
            c[i] = sc.next().charAt(0);
            x[i] = sc.nextInt();
        }

        int res = 0;
        for(int i =a;i<=b;i++){
            int d1 = 1000;
            int d2 = 1000;
            for(int j = 0;j<t;j++){
                if(c[j]=='S'&&Math.abs(i-x[j])<d1){
                    d1 = Math.abs(i-x[j]);
                }

                if(c[j]=='N'&&Math.abs(i-x[j])<d2){
                    d2 = Math.abs(i-x[j]);
                }
            }

            if(d1<=d2){
                res++;
            }
        }

        System.out.println(res);


    }
}