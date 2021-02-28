import java.util.*;
// diagonal traversal in zigzag manner
class diagonaltraversal2{

	public static void print(int[][] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		int[][] arr = {{1, 3, 4, 10},
						{2, 5, 9, 11},
						{6, 8, 12, 15},
						{7, 13, 14, 16}};
		ArrayList<Integer> list = new ArrayList<>();
		print(arr);
		int width = arr[0].length - 1;
		int height = arr.length - 1;
		int row = 0;
		int col = 0;
		boolean goingDown = true;
		while(!isOutOfBounds(row, col, height, width)){
			list.add(arr[row][col]);
			if(goingDown){
				if(col == 0 || row == height){
					goingDown = false;
					if(row == height)
						col += 1;
					else
						row += 1;
				}
				else{
					row++;
					col--;
				}
			}

			else{
				if(row == 0 || col == width){
					goingDown = true;
					if(col == width)
						row += 1;
					else
						col += 1;
				}
				else{
					row--;
					col++;
				}
			}
		}
		System.out.println();
		System.out.println(list);
	}

	public static boolean isOutOfBounds(int row , int col , int height , int width){
		return row < 0 || row > height || col < 0 || col > width;
	}
}