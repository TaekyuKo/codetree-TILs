import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0;i<n;i++){
            String comm = sc.next();
            if(comm.equals("push_back")){
                int num = sc.nextInt(); 
                arr.add(num);
            }else if(comm.equals("pop_back")){
                arr.remove(arr.size()-1);
            }else if(comm.equals("size")){
                System.out.println(arr.size());
            }else if(comm.equals("get")){
                int k = sc.nextInt();
                System.out.println(arr.get(k-1));
            }else{
                //
            }
        }

        
        
    }
}