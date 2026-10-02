public class StringCompression {
    public static void main(String args[]) {
        String str = "aaabbaaccc";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            while (i < str.length() && ch == str.charAt(i)) {
                count++;
                i++;
            }
            sb.append(count);
            sb.append(ch);
            i--;
        }
        System.out.println(sb.toString());
    }
}
