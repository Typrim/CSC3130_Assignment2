public class BubbleSort implements SortingAlgorithm {

    /**
     * Sorts an integer array utilizing the bubble sort algorithm
     *
     * @param input the integer array to be sorted
     * @return the integer array sorted
     */

    @Override
    public int[] sort(int[] input) {
        //loops until all values have been "bubbled up"
        for (int unsortedRange = input.length; unsortedRange > 0; unsortedRange--) {
            //loops through all values that have not been "bubbled up" yet
            for (int index = 0; index < input.length - 1; index++) {
                //swap adjacent values if not in order
                if (input[index] > input[index + 1]) {
                    int swapValue = input[index];
                    input[index] = input[index + 1];
                    input[index + 1] = swapValue;
                }
            }
        }
        return input;
    }
}