class floodfill {
    public static void main(String[] args) {

        int m = 4;
        int n = 3;
        int[][] arr = { { 0, 1, 1 }, { 0, 0, 1 }, { 1, 0, 0 }, { 0, 1, 0 } };
        boolean[][] visited = new boolean[m][n];

        printPath(0, 0, arr, visited, "");
    }

    public static void printPath(int row, int col, int[][] maps, boolean[][] visited, String psf) {

        if (row < 0 || col < 0 || row == maps.length || col == maps[0].length || maps[row][col] == 1
                || visited[row][col] == true) {
            return;
        }

        if (row == maps.length - 1 && col == maps[0].length - 1) {
            System.out.println(psf);
            return;
        }

        // first mark the cell visited;
        visited[row][col] = true;
        printPath(row - 1, col, maps, visited, psf + "t"); // top call
        printPath(row, col - 1, maps, visited, psf + "l"); // left call
        printPath(row + 1, col, maps, visited, psf + "d"); // down call
        printPath(row, col + 1, maps, visited, psf + "r"); // right call

        // if we dont find the path mark the cell unvisited for the different path
        visited[row][col] = false;

    }
}