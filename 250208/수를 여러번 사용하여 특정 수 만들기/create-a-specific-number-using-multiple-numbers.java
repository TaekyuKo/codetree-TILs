import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int res = 0;
        for(int i =0;i<1000;i++){
            int temp = 0;
            if(temp+a*i<=c){
                temp+=a*i;
            }
            
            for(int j =0;j<1000;j++){
                if(temp+b<=c){
                    temp+=b;
                }else{
                    break;
                }
            }
            res = Math.max(res,temp);
        }
        System.out.println(res);
    }
}