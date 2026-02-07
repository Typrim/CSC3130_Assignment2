public class InsertionSort implements SortingAlgorithm {
    @Override
    public int[] sort(int[] input) {
        //input has one or no elements, so it is sorted
        if (input.length < 2) {
            return input;
        }
        //loops through all unsorted values
        for (int index = 1; index < input.length; index++) {
            int index2 = index;
            //inserts unsorted value into sorted section
            while (index2 > 0 && input[index2] < input[index2 - 1]) {
                //swap
                int swapValue = input[index2];
                input[index2] = input[index2 - 1];
                input[index2 - 1] = swapValue;
                index2--;
            }
        }
        //input is sorted in-place
        return input;
    }
}
