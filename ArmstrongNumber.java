public class ArmstrongNumber {
    public static void main(String args[]) {
        int k = 4;
        StringBuilder sb = new StringBuilder();
        int low = (int) Math.pow(10, k - 1);
        int high = low * 10 - 1;
        for (int i = low; i <= high; i++) {
            int temp = i;
            int digitCount = (int) Math.log10(temp) + 1;
            int sum = 0;
            while (temp != 0) {
                int remainder = temp % 10;
                sum += (int) Math.pow(remainder, digitCount);
                temp /= 10;
            }
            if (sum == i) {
                sb.append(sum);
                break;
            }
        }
        System.out.println(sb.toString());
    }
}
