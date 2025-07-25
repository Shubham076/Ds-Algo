class MergeSort {
    private static void print(int[] arr) {
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 6, 9, 5};
        print(merge_sort(arr , 0 , arr.length -1));
    }

    private static int[] merge_sort(int[] arr, int left, int right) {
        if(left == right){
            return new int[]{arr[left]};
        }

        int mid = (left + right) / 2;

        int[] lh = merge_sort(arr , left , mid);
        int[] rh = merge_sort(arr, mid + 1, right);
        int[] merged = merge(lh , rh);
        return merged;
    }

    private static int[] merge(int[] lh, int[] rh) {
        int[] merged = new int[lh.length + rh.length];

        int i = 0 , j = 0 ,k = 0;
        while(i < lh.length && j < rh.length){
            if (lh[i] <= rh[j]) {
                merged[k] = lh[i];
                i++;
                k++;
            } else {
                merged[k] = rh[j];
                j++;
                k++;
            }
        }
            if (i == lh.length) {
                while (j < rh.length) {
                    merged[k] = rh[j];
                    k++;
                    j++;
                }
            }

            if (j == rh.length) {
                while (i < lh.length) {
                    merged[k] = lh[i];
                    k++;
                    i++;
                }
            }
        return merged;
    }
}
