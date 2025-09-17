public class TestSS { 
    // 改进后的顺序查找实现
    public static int search(String key, String[] a) { 
        for (int i = 0; i < a.length; i++) 
            if (a[i].compareTo(key) == 0) return i; 
        return -1; 
    }

    public static void main(String[] args) { 
        // 读取随机生成的白名单字符串数组
        String[] words = StdIn.readAllStrings(); 
        int N = words.length; 

        // 记录开始时间（秒）
        double start = System.currentTimeMillis() / 1000.0; 

        // 执行10N次随机查找（从白名单中选key，确保查找成功）
        for (int i = 0; i < 10 * N; i++) { 
            String key = words[StdRandom.uniform(N)]; 
            if (search(key, words) == -1) 
                StdOut.println(key); // 理论上不会执行（查找必成功）
        } 

        // 计算并输出总耗时
        double now = System.currentTimeMillis() / 1000.0; 
        StdOut.println(Math.round(now - start) + " seconds"); 
    } 
}