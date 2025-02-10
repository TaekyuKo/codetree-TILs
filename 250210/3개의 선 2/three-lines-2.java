import java.util.*;

public class Main {
    public static boolean three(int n,int[] x,int[] y){
        boolean res = false;

        for(int i =0;i<=10;i++){
            for(int j = 0;j<=10;j++){
                for(int k =0;k<=10;k++){
                    boolean temp = true;

                    for(int a = 0;a<n;a++){
                        if(x[a]==i || x[a]==j || x[a]==k){
                            continue;
                        }else{
                            temp = false;
                        }
                    }
                    if(temp == true){
                        res = true;
                        return res;
                    }

                    temp = true;
                    for(int a = 0;a<n;a++){
                        if(y[a]==i||y[a]==j||y[a]==k){
                            continue;
                        }else{
                            temp = false;
                        }
                    }
                    if(temp==true){
                        res = true;
                        return res;
                    }

                    temp = true;
                    for(int a = 0;a<n;a++){
                        if(x[a]==i||y[a]==j||y[a]==k){
                            continue;
                        }else{
                            temp = false;
                        }
                    }
                    if(temp==true){
                        res = true;
                        return res;
                    }

                    temp = true;
                    for(int a = 0;a<n;a++){
                        if(x[a]==i||x[a]==j||y[a]==k){
                            continue;
                        }else{
                            temp = false;
                        }
                    }
                    if(temp==true){
                        res = true;
                        return res;
                    }


                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];
        for(int i =0;i<n;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        boolean res = three(n,x,y);
        if(res){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}