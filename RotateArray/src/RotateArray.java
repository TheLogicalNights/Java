public class RotateArray {
    public int[] rotateArray(int[] numbers, int k) {
        int[] result = new int[numbers.length];

        if (k > numbers.length) {
            k = k % numbers.length;
        }

        for (int i = 0; i < k; i++) {
            result[i] = numbers[numbers.length - k + i];
        }
        int j = 0;

        for (int i = k; i < numbers.length; i++) {
            result[i] = numbers[j];
            j++;
        }

        return result;
    }
}
