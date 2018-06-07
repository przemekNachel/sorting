package codecool;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class SortingTest {

    int[] numbers;
    int[] sortedNumbers;
    final static int AMOUNT = 25555;
    final static int LESS_THAN = 11;

    @Before
    public void setup() {
        numbers = new Generator().generate(AMOUNT, LESS_THAN);
        sortedNumbers = new int[numbers.length];
        System.arraycopy(numbers, 0, sortedNumbers, 0, numbers.length);
        Arrays.sort(sortedNumbers);
    }

    @Test
    public void test_amount() {
        Assert.assertEquals(AMOUNT, numbers.length);
    }

    @Test
    public void test_maxNumber() {
        boolean expected = true;
        for (int number : numbers) {
            if (number >= LESS_THAN) {
                expected = false;
            }
        }
        Assert.assertTrue(expected);
    }

    @Test
    public void test_bubbleSort() {
        new BubbleSort().sort(numbers);
        Assert.assertArrayEquals(sortedNumbers, numbers);
    }

    @Test
    public void test_insertSort() {
        new InsertSort().sort(numbers);
        Assert.assertArrayEquals(sortedNumbers, numbers);
    }

    @Test
    public void test_quickSort() {
        new QuickSort().sort(numbers);
        Assert.assertArrayEquals(sortedNumbers, numbers);
    }

    @Test
    public void test_mergeSort() {
        new MergeSort().sort(numbers);
        Assert.assertArrayEquals(sortedNumbers, numbers);
    }
}
