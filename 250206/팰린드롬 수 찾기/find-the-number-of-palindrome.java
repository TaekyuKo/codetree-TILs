import java.util.*;

public class Main {
    public static boolean palintrom(int x){
        int digit = digit(x);
        int[] num = new int[digit+1];
        for(int i =1;i<=digit;i++){
            int power = (int) Math.pow(10,i);
            int div = (int) Math.pow(10,i-1);
            num[i] = (x % power) / div;
        }

        boolean pal = true;
        for(int i =1;i<=digit/2;i++){
            if(num[digit+1-i]!=num[i]){
                pal = false;
                break;
            }
        }
        return pal;
    }

    public static int digit(int x){
        int div = 10;
        int dig = 1;
        while(x/div>=1){
            div*=10;
            dig++;
        }
        return dig;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int cnt = 0;
        for(int i = x;i<=y;i++){
            if(palintrom(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}