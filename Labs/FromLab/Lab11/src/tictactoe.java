import java.util.Scanner;

public class tictactoe {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		char[][] tictactoe = new char[3][3];
		for (int i = 1; i < 9; i++) {
			// Print whose turn it is
			if (i % 2 == 0) {
				System.out.println("Player 2");
			} else {
				System.out.println("Player 1");
			}
			// Choose where to mark
			System.out.print("Choose the row: ");
			int row = input.nextInt();
			System.out.print("Choose the column: ");
			int column = input.nextInt();
			// Place a mark
			tictactoe[row][column] = mark(i);
			// Print the grid
			for (int j = 0; j < tictactoe.length; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.print(tictactoe[j][k]);
				}System.out.println();
			}  
			boolean won = checkTicTac(tictactoe);
			if (won == true) {
				if (i % 2 == 0) {
					System.out.println("Player 2 won!");
				} else {
					System.out.println("Player 1 won!");
				}
				break;
			}
		}
	}
	
	public static char mark(int turn) {
		char mark = ' ';
		if (turn % 2 == 0) {
			mark = 'X';
		} else {
			mark = 'O';
		}
		return mark;
	}
	
	public static boolean checkTicTac(char[][] grid) {
		boolean won = false;
		for (int i = 0; (i + 2) < grid.length; i++) {
			for (int j = 0; (j + 2) < grid[i].length; j++) {
				if (grid[i][j] == 'X' || grid[i][j] == 'O') {
					if (grid[i][j] == grid [i][(j+1)]) {
						if (grid[i][(j+1)] == grid[i][(j+2)]) {
							won = true;
						}
					} else if (grid[i][j] == grid[i+1][j]) {
						if (grid[i+1][j] == grid[i+2][j]) {
							won = true;
						}
					} else if (grid[i][j] == grid[i+1][j+1]) {
						if (grid[i+1][j+1] == grid[i+2][j+2]) {
							won = true;
						}
					}	
				}
			}
		}
		return won;
	}
}