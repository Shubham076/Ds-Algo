class staircaseToHeaven {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(noOfWays(n));
    }

    public static int noOfWays(int n) {
        int[] ways = new int[n + 1];
        ways[0] = ways[1] = 1;

        for (int i = 2 ; i < ways.length; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }
        return ways[n];
    }
}