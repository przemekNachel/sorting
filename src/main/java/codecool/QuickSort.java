package codecool;

public class QuickSort {

    public void sort(int[] data) {
        quickSort(data, 0, data.length - 1);
    }

    public void quickSort(int[] array, int lowerBound, int upperBound) {
        if (lowerBound >= upperBound) return;

        int pivot = array[upperBound];

        int i = lowerBound - 1;
        int j = lowerBound;

        while (j < upperBound) {
            if (array[j] <= pivot) {
                int temp = array[++i]; array[i] = array[j]; array[j] = temp;
            }
            ++j;
        }

        int temp = array[i + 1]; array[i + 1] = array[upperBound]; array[upperBound] = temp;

        quickSort(array, lowerBound, i);
        quickSort(array, i + 1, upperBound);
    }
}
