public class WhiteFilter { 
    // 查找函数：判断key是否在数组a中，返回索引（-1表示不存在）
    public static int search(String key, String[] a) { 
        for (int i = 0; i < a.length; i++) 
            if (a[i].compareTo(key) == 0) return i; // 比较字符串内容
        return -1; 
    }

    public static void main(String[] args) {
        // 读取白名单文件（命令行参数args[0]为文件路径）
        In in = new In(args[0]); 
        String[] words = in.readAllStrings(); 

        // 读取标准输入，筛选并输出白名单中的字符串
        while (!StdIn.isEmpty()) { 
            String key = StdIn.readString(); 
            if (search(key, words) != -1) 
                StdOut.println(key); 
        } 
    } 
}