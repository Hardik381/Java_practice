public class Toggle {
    public static void main(String args[]) {
        String str = "HeLLo WoRld";
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append((char) (c - 32));
            } else if (c >= 'A' && c <= 'Z') {
                sb.append((char) (c + 32));
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
