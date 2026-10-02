public class FrequencyOfChar {
    public static void main(String args[]) {
        String s = "Hello world i am hahahaha";
        int[] count = new int[256];
        char[] c = s.toCharArray();
        for (char i : c) {
            count[i]++;
        }
        boolean[] shown = new boolean[256];
        System.out.println();
        for (char i : c) {
            if (shown[i] == false) {
                System.out.println(i + ":" + count[i]);
                shown[i] = true;
            }
        }
    }
}
