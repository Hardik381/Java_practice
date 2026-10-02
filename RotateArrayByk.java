public class RotateArrayByk {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int k = 3;
        k = k % arr.length;
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int pos = (i + k) % arr.length;
            temp[pos] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
