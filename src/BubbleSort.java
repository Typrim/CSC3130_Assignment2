public class BubbleSort implements SortingAlgorithm {
    @Override
    public int[] sort(int[] input) {
        //loops until all values have been "bubbled up"
        for (int unsortedRange = input.length - 1; unsortedRange > 0; unsortedRange--) {
            //loops through all values that have not been "bubbled up" yet
            for (int index = 0; index < unsortedRange; index++) {
                //swap adjacent values if not in order
                if (input[index] > input[index + 1]) {
                    int swapValue = input[index];
                    input[index] = input[index + 1];
                    input[index + 1] = swapValue;
                }
            }
        }
        //input is sorted in-place
        return input;
    }
}