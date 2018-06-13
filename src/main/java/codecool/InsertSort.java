package codecool;

public class InsertSort {

    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int value = array[i];
            while (j > 0 && value < array[j - 1]) {
                array[j] =  array[j - 1];
                j--;
            }
            array[j] = value;
        }
    }
}
