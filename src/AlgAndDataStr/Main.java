package AlgAndDataStr;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Quicksort sorter = new Quicksort();
        int[] test = {5, 5, 6, 6, 4, 4, 5, 5, 4, 8, 9, 4, 6, 6, 5, 5};

        System.out.println(Arrays.toString(test));

        sorter.sort(test);

        System.out.println(Arrays.toString(test));
        System.out.println(sorter.count(test));
    }
}