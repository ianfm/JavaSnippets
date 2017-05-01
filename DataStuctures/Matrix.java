// matrix object

public class Matrix {
	public static void main(String[] args) {
		int[][] mat = { {0,1,2}, {3,4,5}, {6,7,8}, {9,0,1}, {2,3,4} };

		for (int[] row:mat) {
			for (int elem:row) {
				System.out.print(elem);
				System.out.print(' ');
			}
			System.out.print('\n');
		}
	}
}
// In terms of printing, this is really a 5 x 3 matrix, and since I would have to 
// make a function to transpose it in order to change the representation to match
// standard mathematical notation.. I'm gonna leave it.