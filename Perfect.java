public class Perfect {
    public static boolean isPerfect(int n) {
        boolean perfect = false;
        int copy = n;
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (copy % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            perfect = true;
        }
        return perfect;
    }

    public static void main(String args[]) {
        for (int i = 1; i < 1000; i++) {
            System.out.println(i + " " + isPerfect(i));
        }
    }
}
