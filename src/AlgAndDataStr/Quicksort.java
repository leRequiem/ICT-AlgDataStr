package AlgAndDataStr;

public class Quicksort {

    private int[] array;

    public void sort(int[] values) {
        if (values == null || values.length==0){
            return;
        }
        this.array = values;
        int number = values.length;
        quicksort(0, number - 1);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;

        int delimeter = array[low + (high-low)/2];

        while (i <= j) {
            while (array[i] < delimeter) {
                i++;
            }
            while (array[j] > delimeter) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }


        private void swap ( int i, int j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        public int count(int[] array) {
            int temp = 1;
            for (int i = 1; i < array.length; i++) {
                if (!(array[i] == array[i - 1])) {
                    temp++;
                }
            }
            return temp;
        }
}