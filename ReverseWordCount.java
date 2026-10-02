public class ReverseWordCount {
    public static void main(String args[]) {
        String str = "i    hello world i am Hardik  the last    ";
        String[] s3 = str.trim().split("\\s+");
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < s3.length; i++) {
            StringBuilder sb = new StringBuilder(s3[i]);
            s1.append(sb.length());
            s1.append(sb.reverse());
        }
        System.out.println(s1.toString());
    }
}
