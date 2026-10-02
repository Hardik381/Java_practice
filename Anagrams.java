public class Anagrams {
    public static void main(String args[]) {
        String str = "race";
        String str2 = "care";
        boolean ans = true;
        if (str.length() != str2.length()) {
            ans = false;
        }
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        char[] c1 = str.toCharArray();
        char[] c2 = str2.toCharArray();
        for (char c : c1) {
            freq1[c]++;
        }
        for (char c : c2) {
            freq2[c]++;
        }
        for (char c : c1) {
            if (freq1[c] != freq2[c]) {
                ans = false;
                break;
            }
        }
        if (ans == false) {
            System.out.println("the string are not anagrams");
        } else {
            System.out.println("the string are anagrams");
        }

    }
}
