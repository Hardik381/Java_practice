public class CarryCount {
    public static void main(String args[]) {
        int n1 = 17;
        int n2 = 7;
        int carry = 0;
        int count = 0;
        while (n1 != 0 && n2 != 0) {
            int digitSum = n1 % 10 + n2 % 10 + carry;
            if (digitSum > 9) {
                carry = 1;
                count++;
            } else {
                carry = 0;
            }
            n1 /= 10;
            n2 /= 10;
        }
        System.out.println(count);
    }
}
