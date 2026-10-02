public class DecimalToBinary {
    public static void main(String args[]) {
        int n = 4;
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            int remainder = n % 2;
            sb.append(remainder);
            n /= 2;
        }
        System.out.println(sb.reverse().toString());
    }
}
