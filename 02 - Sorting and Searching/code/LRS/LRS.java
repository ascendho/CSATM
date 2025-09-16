public class LRS {

    // 返回字符串 s 和 t 的最长公共前缀
    public static String lcp(String s, String t) {
        int n = Math.min(s.length(), t.length());
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != t.charAt(i))
                return s.substring(0, i);
        }
        return s.substring(0, n);
    }


    // 返回字符串 s 的最长重复子串
    public static String lrs(String s) {

        // 后缀数组
        int n  = s.length();
        String[] suffixes = new String[n];
        for (int i = 0; i < n; i++) {
            suffixes[i] = s.substring(i, n);
        }

        // Arrays.sort() 底层使用了优化过的快速排序
        Arrays.sort(suffixes);

        // 寻找最长重复子串
        String lrs = "";
        for (int i = 0; i < n-1; i++) {
            String x = lcp(suffixes[i], suffixes[i+1]);
            if (x.length() > lrs.length())
                lrs = x;
        }
        return lrs;
    }

    // 读取文本，将所有连续的空白替换为单个空格，然后计算最长重复子串
    public static void main(String[] args) {
        String s = StdIn.readAll();
        s = s.replaceAll("\\s+", " ");
        StdOut.println("'" + lrs(s) + "'");
    }
}