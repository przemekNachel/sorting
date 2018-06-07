package codecool;

public class Generator {

    public int[] generate(int amount, int lessThan) {
        int[] numbers = new int[amount];
        for(int i = 0; i < amount; i++) {
            numbers[i] = (int) (Math.random() * lessThan);
        }
        return numbers;
    }
}
