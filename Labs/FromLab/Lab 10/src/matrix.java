import java.util.Scanner;

public class matrix {
	public static int n;
	public static double[][] matrix;
	public static Scanner stdin = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter the dimension n of the matrix: ");
		n = stdin.nextInt();
		matrix = new double[n][n];
		double result = sumColumn(matrix, n);
		System.out.println("total sum is: " + result);
	}
	
	
	public static double sumColumn(double[][]m, int c) {
			double sum_column = 0;
			double sum = 0;
		// initialize the matrix
			System.out.print("Input the matrix content");
			for (int row = 0; row < matrix.length; row++) {
				for (int column = 0; column < matrix[row].length; column++) {
					matrix[row][column] = stdin.nextDouble();
				}
			}
			// display the matrix
			 for(int row = 0; row < matrix.length; row++) {
					for(int column = 0; column < matrix[row].length; column++) {
						System.out.print(matrix[row][column] + " ");
				}
					System.out.println(); 
			 }
			 // sum the columns
			for (int column = 0; column < n; column++) {
				for (int row = 0; row < n; row++) {
					sum_column += matrix[row][column];
					} 
				sum += sum_column;
				System.out.println("column " + (column + 1) + ": " + sum_column);
				sum_column = 0;
				}
			return sum;
	}
}


			