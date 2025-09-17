public class LRS {
    
    // 寻找两个字符串的最长公共前缀
    public static String lcp(String s, String t) {
        int N = Math.min(s.length(), t.length());
        for (int i = 0; i < N; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                return s.substring(0, i);
            }
        }
        
        return s.substring(0, N);
    }
    
    // 寻找字符串 s 的最长重复子串
    public static String lrs(String s) {
        int N = s.length();
        String lrs = "";
        
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                String x = lcp(s.substring(i, N), s.substring(j, N));
                if (x.length() > lrs.length()) {
                    lrs = x;
                }
            }
        }
        
        return lrs;
    }
    
    public static void main(String[] args) {
        String s = StdIn.readAll();
        StdOut.println(lrs(s));
    }
}