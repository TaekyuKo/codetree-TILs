import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String cond = sc.next();

        LinkedList<Character> l = new LinkedList<>();
        for(int i=0;i<n;i++){
            l.add(cond.charAt(i));
        }

        

        ListIterator<Character> it = l.listIterator(l.size());
        for(int i =0;i<m;i++){
            char code = sc.next().charAt(0);
            if(code=='L'){
                if(it.hasPrevious()){
                    it.previous();
                }
            }else if(code=='R'){
                if(it.hasNext()){
                    it.next();
                }
            }else if(code=='D'){
                if(it.hasNext()){
                    it.next();
                    it.remove();
                }
            }else if(code=='P'){
                char insert = sc.next().charAt(0);
                it.add(insert);
            }
        }

        it = l.listIterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }

    }
}