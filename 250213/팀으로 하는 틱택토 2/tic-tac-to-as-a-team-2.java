import java.util.*;

public class Main {
    public static boolean line(int i, int j, int[][] num){
        int cnt_i = 0;
        int cnt_j = 0;

        for(int a = 0;a<3;a++){
            cnt_i = 0;
            cnt_j = 0;
            for(int b = 0;b<3;b++){
                if(num[a][b]==i){
                    cnt_i++;
                }
                if(num[a][b]==j){
                    cnt_j++;
                }
            }

            if(cnt_i+cnt_j==3 && !(cnt_i==3||cnt_i==0)){
                return true;
            }
        }

        for(int b = 0;b<3;b++){
            cnt_i = 0;
            cnt_j = 0;
            for(int a = 0;a<3;a++){
                if(num[a][b]==i){
                    cnt_i++;
                }
                if(num[a][b]==j){
                    cnt_j++;
                }
            }

            if(cnt_i+cnt_j==3 && !(cnt_i==3||cnt_i==0)){
                return true;
            }
        }

        cnt_i = 0;
        cnt_j = 0;
        for(int a = 0;a<3;a++){
            if(num[a][a]==i){
                cnt_i++;
            }
            if(num[a][a]==j){
                cnt_j++;
            }
        }
        if(cnt_i+cnt_j==3 && !(cnt_i==3||cnt_i==0)){
            return true;
        }

        cnt_i = 0;
        cnt_j = 0;
        for(int a = 0;a<3;a++){
            if(num[a][3-a-1]==i){
                cnt_i++;
            }
            if(num[a][3-a-1]==j){
                cnt_j++;
            }
        }
        if(cnt_i+cnt_j==3 && !(cnt_i==3||cnt_i==0)){
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] temp = new String[3];
        for(int i = 0;i<3;i++){
            temp[i] = sc.next();
        }

        char[][] charnum = new char[temp.length][];
        for(int i =0;i<temp.length;i++){
            charnum[i] = temp[i].toCharArray();
        }

        int[][] num = new int[3][];
        for(int i = 0; i < 3; i++) {
            num[i] = new int[3];
            for(int j = 0; j < 3; j++) {
                num[i][j] = charnum[i][j] - '0'; 
            }
        }

        int res = 0; // 팀 수
        for(int i =1;i<10;i++){
            for(int j =i+1;j<10;j++){
                if(line(i,j,num)){
                    res++;
                }
            }
        }
        System.out.println(res);

    }
}