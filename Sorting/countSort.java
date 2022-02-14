// O(n + k)
class countSort {
    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 6, 9, 5, 2, 4, 6, 1};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            max = Math.max(max , i);
            min = Math.min(min , i);
        }
        int range = max - min + 1;
        int[] farr = new int[range];
        for (int i : arr) {
            int idx = i - min;
            farr[idx]++;
        }

        // add prefix represents the last index of a particular
        for (int i = 1; i < farr.length; i++) {
            farr[i] += farr[i - 1];
        }

        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int idx = farr[arr[i] - min] - 1;
            ans[idx] = arr[i];
            farr[arr[i] - min]--;
        }
        print(ans);
    }
}