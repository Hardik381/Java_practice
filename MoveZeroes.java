public class MoveZeroes {
    public static void main(String args[]) {
        int[] arr = { 1, 3, 5, 0, 4, 0, 0, 12, 6 };
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                k++;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
