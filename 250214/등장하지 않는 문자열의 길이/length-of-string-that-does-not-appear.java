import java.util.*;

public class Main {
    public static boolean yes(char[] alpha, char[] new_alpha){
        int cnt = 0;

        int b = 0;
        int a = new_alpha.length;
        while(a<alpha.length){
            if(new_alpha[b] != alpha[a]){
                a++;
                cnt = 0;
            }else{
                cnt++;
                a++;
                b++;
                if(cnt==new_alpha.length){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        char[] alpha = str.toCharArray();

        int res = 0;
        for(int i =0;i<alpha.length;i++){
            char[] new_alpha = new char[i+1];
            for(int j = 0;j<=i;j++){
                new_alpha[j] = alpha[j];
            }

            if(!yes(alpha, new_alpha)){
                res = i;
                break;
            }
        }
        System.out.println(res+1);
        
    }
}