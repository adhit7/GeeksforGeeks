package Arrays;

//https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1#

public class MajorityElement {
    static int majorityElement(int a[], int size)
    {
        // your code here
        int[] max = new int[1000000];
        int count = (int) Math.floor(Math.abs((float) a.length / 2));

        for (int i : a) {
            max[i]++;
        }

        for (int i : a) {
            if (max[i] > count) {
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int size = 3;
        System.out.println(majorityElement(a,size));
    }
}
