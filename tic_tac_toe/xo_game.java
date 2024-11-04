package tic_tac_toe;

import java.util.Scanner;

public class xo_game {

	
	public static void main(String[] args) {
		
		// Features of the Tic Tac Toe Game:
	
		// 1. Game Board Initialization:
//		    - Initializes a 3x3 game board represented as a 2D array filled with empty spaces for player moves.
	
		// 2. Player Turn Management:
//		    - Alternates turns between two players ('X' and 'O'), allowing each to make their move in sequence.
		
		// 3. Win Condition Checking:
//		    - Checks for a winning condition after each move, evaluating rows, columns, and diagonals for three matching symbols.
	
		// 4. Invalid Move Handling:
//		    - Validates user input to ensure moves are made in empty spaces, providing feedback for any invalid attempts.

		
		
		char xo[][]=new char[3][3];
		for(int i=0;i<xo.length;i++) {
			for(int j=0;j<xo[0].length;j++) {
				xo[i][j]=' ';
			}
		}
			
			Scanner s=new Scanner(System.in);
			char player='X';
			boolean gameover=true;
			
			while(gameover) {
				
				System.out.println("Tic Tac Toe GameBoard:");
				Xoboard(xo);
				System.out.println("current player:"+player);
				System.out.println("enter row:");
				int row=s.nextInt();
				System.out.println("enter col:");
				int col=s.nextInt();
				System.out.println();
				
				if(xo[row][col]==' ') {
					xo[row][col]=player;
					gameover=haveown(xo,player);
					if(!gameover) {
						System.out.println("player "+player+" own the game!");
						Xoboard(xo);
						s.close();
					}
					
					player=(player=='X')?'O':'X';
				}
				else {
					System.out.println("Invalid input!");
					s.close();
				}
				
			}
			
		}


	private static boolean haveown(char[][] xo, char player) {
		for(int i=0;i<xo.length;i++) {
			if(xo[i][0]==player && xo[i][1]==player  && xo[i][2]==player ){return false;}
			}
		for(int i=0;i<xo.length;i++) {
			if(xo[0][i]==player && xo[1][i]==player  && xo[2][i]==player ){return false;}
			}
		   if(xo[0][0]==player && xo[1][1]==player  && xo[2][2]==player) {return false;}
		   if(xo[0][2]==player && xo[1][1]==player  && xo[2][0]==player) {return false;}
		    return true;
	}



	private static void Xoboard(char[][] xo) {
		
		for(int i=0;i<xo.length;i++) {
			System.out.print("    | ");
			for(int j=0;j<xo[0].length;j++) {
				System.out.print(xo[i][j]+" | ");
			}
			System.out.println();
			
		}
	}

}
