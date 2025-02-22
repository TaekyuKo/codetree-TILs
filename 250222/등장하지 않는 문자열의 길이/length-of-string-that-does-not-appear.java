import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        int res = 1;

        for(int i =1;i<n;i++){
            boolean twin = false;

            for(int j =0;j<=n-i;j++){
                for(int k =j+1;k<=n-i;k++){
                    boolean same = true;

                    for(int l =0;l<i;l++){
                        if(str.charAt(j+l) != str.charAt(k+l)){
                            same = false;
                        }
                    }
                    if(same){
                        twin = true;
                    }
                }
            }

            if(twin == true){
                res = i+1;
            }else{
                break;
            }
        }

        System.out.println(res);
    }
}