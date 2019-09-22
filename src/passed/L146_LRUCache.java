package passed;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @Author: yk
 * @Date: 2019/9/6 16:31
 */
public class L146_LRUCache {
    private HashMap<Integer, Integer> hm = new HashMap<>();
    private LinkedList<Integer> ll = new LinkedList<>();
    private int capacity;
    private int len;

    public L146_LRUCache(int capacity) {
        this.capacity = capacity;
        len = 0;
    }

    public int get(int key) {
        if (hm.containsKey(key)) {
            ll.remove(key);
            ll.offerFirst(key);
            return hm.get(key);
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if (hm.containsKey(key)) {
            hm.put(key, value);
            ll.remove(key);
            ll.offerFirst(key);
        } else {
            if (len < capacity) {
                hm.put(key, value);
                ll.offerFirst(key);
                len++;
            } else {
                Integer lastKey = ll.pollLast();
                ll.offerFirst(key);
                hm.remove(lastKey);
                hm.put(key, value);
            }
        }
    }
}
