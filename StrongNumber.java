public class StrongNumber {
    public static boolean isStrong(int n) {
        boolean strong = false;
        int copy = n;
        int sum = 0;
        while (copy != 0) {
            int remainder = copy % 10;
            int fact = 1;
            for (int i = remainder; i >= 1; i--) {
                fact *= i;
            }
            sum += fact;
            copy /= 10;
        }
        if (sum == n) {
            strong = true;
        }
        return strong;
    }

    public static void main(String args[]) {
        for (int i = 1; i <= 999; i++) {
            System.out.println(i + " " + isStrong(i));
        }
    }
}
