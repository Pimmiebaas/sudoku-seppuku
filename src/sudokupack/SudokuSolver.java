package sudokupack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SudokuSolver {

	public static void main(String[] args) {

		int[][] sudoku;
		sudoku = new int[9][9];
		
		try {
			sudoku = readFile("reeesource/sudoku1.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		SudokuSolver.toString(sudoku);
		String[] fruitjes = new String[4];
		fruitjes[0] = "appel";
		fruitjes[1] = "peer";
		fruitjes[2] = "kiwi";
		fruitjes[3] = "mango";
		
		
		for(int i = 0; i<fruitjes.length; i++) {
		
			//System.out.println(fruitjes[i]);
		}
		
		int i = 0;
		
		while(i<fruitjes.length) {
			System.out.println(fruitjes[i]);
			i++;
		}

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

	public static int[][] readFile(String pad) throws IOException {

		int[][] sudoku = new int[9][9];
		
		
		
		BufferedReader br;
		br = new BufferedReader(new FileReader(pad));
		String line = br.readLine();
		int y = 0;
		
		while(line != null) {
			line = line.trim(); //530090850
			for(int x = 0; x<9; x++) {
				
				char pieter = line.charAt(x);
				int fritz = Integer.valueOf(String.valueOf(pieter));
				
				sudoku[y][x] = fritz;
				
			}
			
			line = br.readLine();
			
			y++;
		}

		
		return sudoku;

	}

}
