public class Generator { 
    // 生成长度为L、字符集为alpha的随机字符串
    public static String randomString(int L, String alpha) { 
        char[] a = new char[L]; 
        for (int i = 0; i < L; i++) { 
            int t = StdRandom.uniform(alpha.length()); 
            a[i] = alpha.charAt(t); 
        } 
        return new String(a); 
    }

    public static void main(String[] args) { 
        int N = Integer.parseInt(args[0]); // 字符串数量
        int L = Integer.parseInt(args[1]); // 每个字符串长度
        String alpha = args[2]; // 字符集（如"a-z"表示小写字母）
        
        // 输出N个随机字符串
        for (int i = 0; i < N; i++) 
            StdOut.println(randomString(L, alpha)); 
    } 
}