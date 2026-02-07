public class ShellSort implements SortingAlgorithm {
    @Override
    public int[] sort(int[] input) {
        int[] gaps = generateGaps(input.length);
        for (int gap : gaps) {
            for (int array = 0; array < gap; array++) {
                shellInsertionSort(input, input.length, gap, array);
            }
        }
        return input;
    }

    private void shellInsertionSort(int[] array, int arrayLength, int gap, int arrayIndex) {
        for (int index1 = arrayIndex + gap; index1 < arrayLength; index1 += gap) {
            int index2 = index1;
            while (index2 - gap >= arrayIndex && array[index2] < array[index2 - gap]) {
                int temporary = array[index2];
                array[index2] = array[index2 - gap];
                array[index2 - gap] = temporary;
                index2 -= gap;
            }
        }
    }

    private int[] generateGaps(int arrayLength) {
        int lowestExponential = 2;
        int gapArrayLength = 1;
        while (lowestExponential - 1 <= arrayLength) {
            lowestExponential *= 2;
            gapArrayLength++;
        }
        int[] gaps = new int[gapArrayLength];
        for (int index = 0; index < gapArrayLength; index++) {
            lowestExponential /= 2;
            gaps[index] = lowestExponential - 1;
        }
        return gaps;
    }
}
