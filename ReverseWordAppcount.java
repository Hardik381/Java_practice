public class ReverseWordAppcount {
    public static void main(String args[]) {
        String str = "Cloud Analogy";
        String[] s = str.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            StringBuilder temp = new StringBuilder(s[i]);
            sb.append(temp.reverse());
            sb.append(temp.length());
        }
        System.out.println(sb.toString());
    }
}
