public class PasswordUsingPrime {
    public static boolean isPrime(int n) {
        boolean prime = true;
        for (int i = 2; i <= (n / 2); i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String args[]) {
        int k = 6;
        int n = 2;
        int found = 0;
        StringBuilder pass = new StringBuilder();
        while (found < k) {
            boolean ans = isPrime(n);
            if (ans) {
                pass.append(n);
                found++;
            }
            n++;
        }
        System.out.println(pass.toString());
    }
}
