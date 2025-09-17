import java.util.Arrays;

public class BinarySearch {

    // 返回key在有序数组a中的索引，找不到则返回-1
    public static int search(String key, String[] a) {
        return search(key, a, 0, a.length);
    }
    public static int search(String key, String[] a, int lo, int hi) {
        // 可能的key索引范围在[lo, hi)内
        if (hi <= lo) return -1;
        int mid = lo + (hi - lo) / 2;
        int cmp = a[mid].compareTo(key);
        if      (cmp > 0) return search(key, a, lo, mid);
        else if (cmp < 0) return search(key, a, mid+1, hi);
        else              return mid;
    }


    // 允许清单，异常过滤
    public static void main(String[] args) {
       
    }
}