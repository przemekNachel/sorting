package codecool;

public class MergeSort {

    int[] array, tempArray;

    public void sort(int[] array) {
        this.array = array;
        tempArray = new int[array.length];
        mergeSort(0, array.length - 1);
    }

    private void mergeSort(int l, int r) {
        if(l < r) {
            int m = (l + r) / 2;
            mergeSort(l, m);
            mergeSort(m + 1, r);
            merge(l, m , r);
        }
    }

    private void merge(int l, int m, int r) {
        int i, j, q;

        for(i = l; i <= r; i ++) tempArray[i] = array[i];

        i = l; j = m + 1; q = l;

        while (i <= m && j <= r) {
            if(tempArray[i] < tempArray[j]) {
                array[q++] = tempArray[i++];
            } else {
                array[q++] = tempArray[j++];
            }
        }
        while (i <= m) {
            array[q++] = tempArray[i++];
        }
    }
}
