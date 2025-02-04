import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        int[] p = new int[n];
        int[] s = new int[n];
        for(int i = 0;i<n;i++){
            p[i] = sc.nextInt();
            s[i] = sc.nextInt();
        }
        
        int res = 0;
        for(int i = 0;i<n;i++){
            int[] tmp = new int[n];
            for(int j = 0; j < n; j++){
                tmp[j] = p[j] + s[j];
            }
            tmp[i] = p[i] / 2 + s[i];

            Arrays.sort(tmp);

            int student = 0;
            int cnt = 0;
        
            for(int j = 0; j < n; j++) {
                if(cnt + tmp[j] > b)
                    break;
                cnt += tmp[j];
                student++;
            }

            res = Math.max(res, student);
        }

        System.out.println(res);

    }
}