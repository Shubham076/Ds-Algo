class targetSumSubset {
    public static void main(String[] args) {
        int[] arr = { 10, 1, 2, 7, 6, 3, 5 };
        int target = 8;
        printTargetSumSubsets(0, arr, target, 0, "");
        System.out.println();
    }

    public static void printTargetSumSubsets(int idx, int[] arr, int tar, int csum, String asf) {
        if (csum > tar) {
            return;
        }

        if (idx == arr.length) {
            if (csum == tar) {
                System.out.println(asf + ".");
            }
            return;
        }

        printTargetSumSubsets(idx + 1, arr, tar, csum + arr[idx], asf + arr[idx]);
        printTargetSumSubsets(idx + 1, arr, tar, csum, asf);
    }
}