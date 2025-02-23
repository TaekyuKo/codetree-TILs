import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String str = sc.next();
        int[] num = new int[n];
        for(int i = 0;i<n;i++){
            num[i] = str.charAt(i)-'0';
        }

        int res = 0;
        for(int i =0;i<n;i++){
            int inno = Integer.MAX_VALUE;
            if(num[i]==1){
                continue;
            }else{
                num[i]=1;
            }

            int temp = 0;
            for(int a= 1;a<n;a++){
                if(num[a]==0){
                    temp++;
                }else{
                    temp++;
                    inno = Math.min(inno,temp);
                    temp = 0;
                }
            }
            res = Math.max(res,inno);
            num[i] = 0;
        }
        System.out.println(res);
    }
}