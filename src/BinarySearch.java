public class BinarySearch {
    int[] list;
    int target;

    public BinarySearch(int[] list, int target) {
        this.list = list;
        this.target = target;
    }

    public int binarySearch() {
        int lowerBound = 0;
        int upperBound = list.length - 1;
        int midPoint = lowerBound + (upperBound - lowerBound)/2;

        while (upperBound >= lowerBound) {
            if(list[midPoint] == target) {
                return midPoint ;
            }
            if(list[midPoint] < target) {
                lowerBound = midPoint + 1;
            }
            if(list[midPoint] > target) {
                upperBound = midPoint - 1;
            }
            midPoint = lowerBound + (upperBound - lowerBound)/2;
        }
    return -1;
    }

}
