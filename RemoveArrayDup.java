import java.util.*;

public class RemoveArrayDup {
    public static void main(String args[]) {
        int[] arr = { 4, 2, 4, 5, 2, 6 };
        ArrayList<Integer> a1 = new ArrayList<>();
        for (int i : arr) {
            if (!a1.contains(i)) {
                a1.add(i);
            }
        }
        System.out.println(a1);
    }
}
