package codecool;

public class BubbleSort {

    public void sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            boolean change = false;
            for (int j = 0; j < i; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j]; array[j] = array[j + 1]; array[j + 1] = temp;
                    change = true;
                }
            }
            if(!change) break;
        }
    }
}
