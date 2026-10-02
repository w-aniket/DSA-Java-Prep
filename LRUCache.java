import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Solutions {

    Map<Integer, Integer> m = new HashMap<>();
    Deque<Integer> q = new LinkedList<>();
    int capacity = 2;

    void get(int key){
        if(!m.containsKey(key)) {
            System.out.println( -1 );
            return;
        }

        q.remove(key);
        q.addFirst(key);

        System.out.println( m.get(key));
    }

    void put(int key, int val){
        if(m.containsKey(key)) {
            q.remove(key);
            q.addFirst(key);
            m.put(key, val);
            return;
        }

        if(q.size() >= capacity) {
            m.remove(q.pollLast());
        }

        q.addFirst(key);
        m.put(key, val);
    }
}

public class LRUCache {
    public static void main(String[] args) {
        Solutions obj = new Solutions();
        obj.put(1,1);
        obj.put(2,2);
        obj.get(1);
        obj.put(3, 3);
        obj.get(2);
    }
}
    