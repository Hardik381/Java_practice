public class FirstNonRepeating {
    public static void main(String args[]) {
        String str = "hawai";
        int[] freq = new int[256];
        char[] ch = str.toCharArray();
        for (char c : ch) {
            freq[c]++;
        }
        for (char c : ch) {
            if (freq[c] < 2) {
                System.out.println("the first non repeating character is " + c);
                break;
            }
        }
    }
}
