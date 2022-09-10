public class KadaneAlgorithm {
    int[] list;

    public KadaneAlgorithm(int[] list) {
        this.list = list;
    }

    public int maxSum() {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i <= list.length-1; i++) {
            currSum += list[i];
            if(currSum > maxSum) {
                maxSum = currSum;
            }
            if(currSum < 0) {
                currSum = 0;
            }

        }
        return maxSum;
    }
}
