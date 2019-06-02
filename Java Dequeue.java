    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<Integer>();
            HashSet<Integer> hs = new HashSet<Integer>();
            int n = in.nextInt();
            int m = in.nextInt();
            int un_val=0;

            for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            
            deque.add(input);
            hs.add(input);
            
            if (deque.size() == m) {
                if (un_val < hs.size()) {
                    un_val = hs.size();
                    
                }
                int first = deque.remove();
                if(!deque.contains(first)){
                hs.remove(first);
                }
                
            }
        }
        System.out.println(un_val);
        
            
        }
    }



