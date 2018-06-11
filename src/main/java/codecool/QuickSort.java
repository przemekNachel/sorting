package codecool;

public class QuickSort {

    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int l, int r) {
        int i = l, j = r, temp;
        int m = array[(l + r) / 2];

        do {
            while (array[i] < m) i++;
            while (array[j] > m) j--;
            if (i <= j) {
                temp = array[i]; array[i] = array[j]; array[j] = temp;
                i++; j--;
            }
        } while (i <= j);
        if (l < j) quickSort(array, l, j);
        if (i < r) quickSort(array, i, r);
    }
}

