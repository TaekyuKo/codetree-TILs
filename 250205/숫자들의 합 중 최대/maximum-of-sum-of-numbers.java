import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int max = 0;
        for(int i = x;i<=y;i++){
            int d1 = i/10000;
            int d2 = (i/1000) % 10;
            int d3 = (i/100) % 100;
            int d4 = (i/10) % 1000;
            int d5 = i % 10;
            int sum = d1+d2+d3+d4+d5;
            max = Math.max(max,sum);
        }

        System.out.println(max);
    }
}