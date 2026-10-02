public class RemoveDuplicates {
    public static void main(String args[]) {
        String str = "programming";
        int[] freq = new int[256];
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256];
        char[] ch = str.toCharArray();
        for (char c : ch) {
            freq[c]++;
        }
        for (char c : ch) {
            if (seen[c] == false) {
                sb.append(c);
                seen[c] = true;
            }
        }
        System.out.println(sb.toString());
    }
}
