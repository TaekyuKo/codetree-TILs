import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0;i<n;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int m = Integer.MAX_VALUE;
        for(int i = 0;i<=100;i+=2){
            for(int j =0;j<=100;j+=2){
                int temp = 0;
                int[] d_temp = new int[4];

                for(int k = 0;k<n;k++){
                    if(x[k]>i && y[k]>j){
                        d_temp[0]++;
                    }else if(x[k]>i && y[k]<j){
                        d_temp[1]++;
                    }else if(x[k]<i && y[k]>j){
                        d_temp[2]++;
                    }else if(x[k]<i && y[k]<j){
                        d_temp[3]++;
                    }else{
                        // 축상 좌표 케이스 제외
                    }
                }

                for(int a =0;a<4;a++){
                    if(temp<d_temp[a]){
                        temp = d_temp[a];
                    }   
                }

                m = Math.min(m,temp);
            }
        }
        System.out.println(m);
    }
}