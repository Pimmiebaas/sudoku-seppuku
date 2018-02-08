package sudokupack;

import java.util.ArrayList;

public class SudokuSolver {

	public static void main(String[] args) {

		int[][] sudoku;
		sudoku = new int[9][9];

		sudoku[0][0] = 5;
		sudoku[0][1] = 3;
		sudoku[0][4] = 7;

		sudoku[1][0] = 6;
		sudoku[1][3] = 1;
		sudoku[1][4] = 9;
		sudoku[1][5] = 5;

		sudoku[2][1] = 9;
		sudoku[2][2] = 8;
		sudoku[2][7] = 6;



		SudokuSolver.toString(sudoku);
		String[] fruitjes = new String[3];
		fruitjes[0] = "appel";
		fruitjes[1] = "peer";
		fruitjes[2] = "kiwi";

		//System.out.println(fruitjes[1]);

	}

	public static void toString(int[][] sudokuBord) {

		String sudokutje = new String();
		int y;
		for(y = 0; y<9; y++) { //loopt over rijen
			for(int x = 0; x<9; x++) { //loopt over kolommen
				System.out.print(sudokuBord[y][x]);
			}
			System.out.print("\n");
		}
		
		
	}
	
	public static int checkState(int[][] sudokuBord ) {
		int state = 0;
		return state;
	}

}
