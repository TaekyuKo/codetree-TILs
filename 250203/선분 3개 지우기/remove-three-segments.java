import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] line = new int[n][2];
        for(int i = 0;i<n;i++){
            line[i][0] = sc.nextInt();
            line[i][1] = sc.nextInt();
        }

        int res = 0;
        for(int i =0;i<n;i++){
            for(int j = i+1;j<n;j++){
                for(int k =j+1;k<n;k++){ 
                    int[] cnt = new int[101];
                    for(int s = 0;s<n;s++){
                        if(s==i||s==j||s==k){
                            continue;
                        }
                        for(int a = line[s][0];a<=line[s][1];a++){
                            cnt[a]++;
                        }
                    }

                    boolean isone = true;
                    for(int a = 0;a<=100;a++){
                        if(cnt[a]>1){
                            isone = false;
                            break;
                        }
                    }

                    if(isone==true){
                        res++;
                    }

                }

            }
        }

        System.out.println(res);
    }
}