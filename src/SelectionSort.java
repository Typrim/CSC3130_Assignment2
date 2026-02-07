public class SelectionSort implements SortingAlgorithm {
    @Override
    public int[] sort(int[] input) {
        for (int index = 0; index < input.length - 1; index++) {
            int indexLowestValue = index;
            for (int index2 = index + 1; index2 < input.length; index++) {
                if (input[index2] < input[indexLowestValue]) {
                    indexLowestValue = index2;
                }
            }
            //sort smallest value
            int swapValue = input[index];
            input[index] = input[indexLowestValue];
            input[indexLowestValue] = swapValue;
        }
        //input is sorted in-place
        return input;
    }
}
