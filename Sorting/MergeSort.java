class MergeSort {
    private static void print(int[] arr) {
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,1,4,6,9,5};
        print(merge_sort(arr , 0 , arr.length -1));
    }

    private static int[] merge_sort(int[] arr , int f ,int l) {

        if(f == l){
            int[] list = new int[1];
            list[0] = arr[f];

            return list;
        }

        int mid = (f + l) / 2;

        int[] lh = merge_sort(arr , f , mid);
        int[] rh = merge_sort(arr, mid + 1, l);
        int[] merged = merge(lh , rh);
        return merged;
    }

    private static int[] merge(int[] lh, int[] rh) {
        int[] merged = new int[lh.length + rh.length];

        int i = 0 , j = 0 ,k = 0;
        while(i < lh.length && j < rh.length){

            if(lh[i] <= rh[j]){
                merged[k] = lh[i];
                i++;
                k++;
            }

            else {
                merged[k] = rh[j];
                j++;
                k++;
            }
        }
            if(i == lh.length){
                while(j < rh.length){
                    merged[k] = rh[j];
                    k++;
                    j++;
                }
            }

            if(j == rh.length){
                while(i < lh.length){
                    merged[k] = lh[i];
                    k++;
                    i++;
                }
            }
        return merged;
    }
}
