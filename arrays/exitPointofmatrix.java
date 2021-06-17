public class exitPointofmatrix {
    public static void main(String[] args) {
        int[][] arr = {{0, 0, 1, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {1, 0, 1, 0}};
        int i = 0 , j = 0 , dir = 0;
        while (true) {

            dir += arr[i][j] % 4;
            if (dir == 0) { // east
                j++;
            }
            if (dir == 1) { // south,
                i++;
            }
            if (dir == 2) { //west
                j--;
            }
            if (dir == 3) { // north
                i--;
            }

            if (i < 0) {
                i++;
                break;
            }
            if (j < 0) {
                j++;
                break;
            }
            if (i == arr.length) {
                i--;
                break;
            }
            if (j == arr[0].length) {
                j--;
                break;
            }
        }

        System.out.println(i);
        System.out.println(j);
    }
}
