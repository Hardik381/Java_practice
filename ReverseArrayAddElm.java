public class ReverseArrayAddElm {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4 };
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        start = 0;
        end = arr.length - 1;
        while (start < end) {
            int sum = arr[start] + arr[start + 1];
            arr[start] = sum;
            start++;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
