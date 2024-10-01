import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0;i<n;i++){
            String comm = sc.next();
            if(comm.equals("push_front")){
                int k = sc.nextInt();
                list.addFirst(k);
            }else if(comm.equals("push_back")){
                int k = sc.nextInt();
                list.addLast(k);
            }else if(comm.equals("pop_front")){
                System.out.println(list.pollFirst());
            }else if(comm.equals("pop_back")){
                System.out.println(list.pollLast());
            }else if(comm.equals("size")){
                System.out.println(list.size());
            }else if(comm.equals("empty")){
                if(list.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(comm.equals("front")){
                System.out.println(list.peekFirst());
            }else if(comm.equals("back")){
                System.out.println(list.peekLast());
            }else{
                //
            }
        }
    }
}