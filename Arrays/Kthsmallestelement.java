package Arrays;


import java.util.Arrays;

public class Kthsmallestelement {
    public static int kthSmallest(int[] arr, int k)
    {
        Arrays.sort(arr);
        return arr[k - 1];
    }
    public static void main(String[] args) {
        int[] arr = {7,10,3,4,20,15};
        System.out.println(kthSmallest(arr, 3));
    }
}
