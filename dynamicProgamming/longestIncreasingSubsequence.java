class LIS {
    public static void main(String[] args) {

        int[] arr = { 10, 22, 9, 33, 21, 50};

        System.err.println("Length of longest increasing subsequence is:"+lis(arr));
        System.err.println("Length of longest decreasing subsequence is:"+lds(arr));


    }


    // dynamic programming
    public static int lis(int[] arr) {

        int length = 0;

        int[] d = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            d[i] = 1;

        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {

                if (arr[i] > arr[j]) {
                    d[i] = (int) Math.max(d[i], d[j] + 1);
                }
            }
        }

        for (int i : d) {

            length = (int) Math.max(length, i);

        }

        return length;
    }


    // longest decreasing subsequence
    public static int lds(int[] arr) {

        int length = 0;

        int[] d = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            d[i] = 1;

        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {

                if (arr[i] < arr[j]) {
                    d[i] = (int) Math.max(d[i], d[j] + 1);
                }
            }
        }

        for (int i : d) {

            length = (int) Math.max(length, i);

        }

        return length;
    }
}