import java.util.*;

public class Main {
    public static boolean interest(int x){
        int dig = digit(x);
        int[] num = new int[dig+1];

        for(int i =1;i<=dig;i++){
            int power = (int) Math.pow(10,i);
            int div = (int) Math.pow(10,i-1);
            num[i] = (x % power)/div;
        }

        int[] zerotonine = new int[10]; //0~9
        for(int i =1;i<=dig;i++){
            zerotonine[num[i]]++;
        }

        boolean res = false;
        for(int i =0;i<=9;i++){
            if(zerotonine[i]==dig-1){
                res = true;
                break;
            }
        }

        return res;


    }

    public static int digit(int x){
        int div = 10;
        int num = 1;
        while(x/div>=1){
            div*=10;
            num++;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int res = 0;
        for(int i = x;i<=y;i++){
            if(interest(i)==true){
                res++;
            }
        }

        System.out.println(res);
    }
}