/******************************************************************************
 *  Purpose: Program is for tic tac toe game.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	public static char board[][] = new char[3][3];
	public static int counter = 1;
	public static String firstMove;
	public static boolean end = false;
	public static char win;

	public static void main(String[] args) throws InterruptedException {

		Scanner scanner = new Scanner(System.in);

		// start we assign board as - everywhere in array
		// initializing board

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = '-';
			}
		}

		// taking input from user
		// to decide who will play first
		System.out.println("Tossing");
		String first;

		if (Math.random() > 0.5)
			first = "c";
		else
			first = "h";

		if (first.equals("c")) {
			System.out.println("Computer goes first");
			move();
			// end false
			while (!end) {

				printBoard();

				// getting humans move

				System.out.println("Your next move");
				String move = scanner.next();
				if (move.equals("00") && board[0][0] == '-') {
					board[0][0] = 'O';
				} else if (move.equals("01") && board[0][1] == '-') {
					board[0][1] = 'O';
				} else if (move.equals("02") && board[0][2] == '-') {
					board[0][2] = 'O';
				} else if (move.equals("10") && board[1][0] == '-') {
					board[1][0] = 'O';
				} else if (move.equals("11") && board[1][1] == '-') {
					board[1][1] = 'O';
				} else if (move.equals("12") && board[1][2] == '-') {
					board[1][2] = 'O';
				} else if (move.equals("13") && board[1][3] == '-') {
					board[1][3] = 'O';
				} else if (move.equals("20") && board[2][0] == '-') {
					board[2][0] = 'O';
				} else if (move.equals("21") && board[2][1] == '-') {
					board[2][1] = 'O';
				} else if (move.equals("22") && board[2][2] == '-') {
					board[2][2] = 'O';
				} else {
					System.out.println("Invalid move");

				}

				System.out.println();
				// getting computers input
				move();
			}
			if (win == 'o') {
				System.out.println("Human Won");
			} else if (win == 'X') {
				System.out.println("Computer Won");
			} else if (win == 'd' || win == 'D') {
				System.out.println("Game is a draw");
			}

		} else if (first.toLowerCase().equals("h")) {
			System.out.println("Human goes first");
			System.out.println("enter your move");
			String move = scanner.next();
			if (move.equals("00") && board[0][0] == '-') {
				board[0][0] = 'O';
			} else if (move.equals("01") && board[0][1] == '-') {
				board[0][1] = 'O';
			} else if (move.equals("02") && board[0][2] == '-') {
				board[0][2] = 'O';
			} else if (move.equals("10") && board[1][0] == '-') {
				board[1][0] = 'O';
			} else if (move.equals("11") && board[1][1] == '-') {
				board[1][1] = 'O';
			} else if (move.equals("12") && board[1][2] == '-') {
				board[1][2] = 'O';
			} else if (move.equals("20") && board[2][0] == '-') {
				board[2][0] = 'O';
			} else if (move.equals("21") && board[2][1] == '-') {
				board[2][1] = 'O';
			} else if (move.equals("22") && board[2][2] == '-') {
				board[2][2] = 'O';
			} else {
				System.out.println("That is not a valid move");
			}
			printBoard();

			while (!end) {
				hMove();
				end = won();

				if (end) {
					break;
				}

				printBoard();

				System.out.println("enter your move");
				move = scanner.next();
				if (move.equals("00") && board[0][0] == '-') {
					board[0][0] = 'O';
				} else if (move.equals("01") && board[0][1] == '-') {
					board[0][1] = 'O';
				} else if (move.equals("02") && board[0][2] == '-') {
					board[0][2] = 'O';
				} else if (move.equals("10") && board[1][0] == '-') {
					board[1][0] = 'O';
				} else if (move.equals("11") && board[1][1] == '-') {
					board[1][1] = 'O';
				} else if (move.equals("12") && board[1][2] == '-') {
					board[1][2] = 'O';
				} else if (move.equals("20") && board[2][0] == '-') {
					board[2][0] = 'O';
				} else if (move.equals("21") && board[2][1] == '-') {
					board[2][1] = 'O';
				} else if (move.equals("22") && board[2][2] == '-') {
					board[2][2] = 'O';
				} else {
					System.out.println("That is not a valid move");
				}
				// </editor-fold>

				System.out.println();

				end = won();

			}
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}

			if (win == 'X') {
				printBoard();
				System.out.println("Computer Won");
			} else if (win == 'o') {
				printBoard();
				System.out.println("Human Won");
			} else if (win == 'd') {
				printBoard();
				System.out.println("Game is a Draw");
			}
		} else {
			System.out.println("That is not a valid input program will close");
		}
		scanner.close();
	}

	public static void move() {
		Random random = new Random();
		int f = random.nextInt(4) + 1;// 0 to 4
		// first move
		if (counter == 1) {

			if (f == 1) {
				// then it is 00
				board[0][0] = 'X';
				firstMove = "00";
				// System.out.println("CHECK");
			} else if (f == 2) {
				// then it is 02
				board[0][2] = 'X';
				firstMove = "02";
				// System.out.println("CHECK");
			} else if (f == 3) {
				// then it is 20
				board[2][0] = 'X';
				firstMove = "20";
				// System.out.println("CHECK");
			} else if (f == 4) {
				// then it is 20
				board[2][2] = 'X';
				firstMove = "22";
				// System.out.println("CHECK");
			} else {
				// else is for safety reason
				// then it is 22
				board[2][2] = 'X';
				firstMove = "22";
				// System.out.pFrintln("CHECK");
			}

		}
		// second move
		if (counter == 2) {

			if (board[1][1] == '-') {
				board[1][1] = 'X';
			} else {
				if (firstMove.equals("00")) {
					board[0][2] = 'X';
				} else if (firstMove.equals("02")) {
					board[2][2] = 'X';
				} else if (firstMove.equals("20")) {
					board[2][2] = 'X';
				} else if (firstMove.equals("22")) {
					board[0][2] = 'X';
				}
			}
			end = won();
		}

		// third move
		if (counter == 3) {
			// checks users move in corresponding line then stop user
			int second[] = stopUserFromWinningMove();
			// this condition will tell user not draw O in correspondance row or column
			if (second[0] != 5) {
				board[second[0]][second[1]] = 'X';
			} else {
				int secondMy[] = userNotWinningMyMove();
				if (secondMy[0] != 5) {
					board[secondMy[0]][secondMy[1]] = 'X';
				} else {
					secondMy = noOtherOption();
					board[secondMy[0]][secondMy[1]] = 'X';
				}
			}
			end = won();
		}

		// fourth move
		if (counter == 4) {
			if (!end) {
				int second[] = stopUserFromWinningMove();
				if (second[0] != 5) {
					// System.out.println("CHECK");
					board[second[0]][second[1]] = 'X';
				} else {
					int secondMy[] = userNotWinningMyMove();
					if (secondMy[0] != 5) {
						board[secondMy[0]][secondMy[1]] = 'X';
					} else {
						secondMy = noOtherOption();
						board[secondMy[0]][secondMy[1]] = 'X';
					}
				}
			}
			end = won();
		}
		// fifth move
		if (counter == 5) {
			if (!end) {
				int second[] = stopUserFromWinningMove();
				if (second[0] != 5) {
					// System.out.println("CHECK");
					board[second[0]][second[1]] = 'X';
				} else {
					int secondMy[] = userNotWinningMyMove();
					if (secondMy[0] != 5) {
						board[secondMy[0]][secondMy[1]] = 'X';
					} else {
						secondMy = noOtherOption();
						board[secondMy[0]][secondMy[1]] = 'X';
					}
				}
			}
			end = won();
		}
		counter++;
	}

	public static int[] stopUserFromWinningMove() {

		int[] ret = new int[2];
		ret[0] = 5;

		if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == '-') {
			ret[0] = 0;
			ret[1] = 2;
		} else if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == '-') {
			ret[0] = 2;
			ret[1] = 0;
		} else if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == '-') {
			ret[0] = 2;
			ret[1] = 2;
		} else if (board[0][1] == 'O' && board[0][2] == 'O' && board[0][0] == '-') {
			ret[0] = 0;
			ret[1] = 0;
		} else if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == '-') {
			ret[0] = 2;
			ret[1] = 1;
		} else if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == '-') {
			ret[0] = 2;
			ret[1] = 0;
		} else if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == '-') {
			ret[0] = 2;
			ret[1] = 2;
		} else if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == '-') {
			ret[0] = 1;
			ret[1] = 2;
		} else if (board[1][0] == 'O' && board[2][0] == 'O' && board[0][0] == '-') {
			ret[0] = 0;
			ret[1] = 0;
		} else if (board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == '-') {
			ret[0] = 0;
			ret[1] = 2;
		} else if (board[2][1] == 'O' && board[1][1] == 'O' && board[0][1] == '-') {
			ret[0] = 0;
			ret[1] = 1;
		} else if (board[2][2] == 'O' && board[1][1] == 'O' && board[0][0] == '-') {
			ret[0] = 0;
			ret[1] = 0;
		} else if (board[1][1] == 'O' && board[1][2] == 'O' && board[1][0] == '-') {
			ret[0] = 1;
			ret[1] = 0;
		} else if (board[2][2] == 'O' && board[1][2] == 'O' && board[0][2] == '-') {
			ret[0] = 0;
			ret[1] = 2;
		} else if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == '-') {
			ret[0] = 2;
			ret[1] = 2;
		} else if (board[2][1] == 'O' && board[2][2] == 'O' && board[2][0] == '-') {
			ret[0] = 2;
			ret[1] = 0;
		} else if (board[0][0] == 'O' && board[0][2] == 'O' && board[0][1] == '-') {
			ret[0] = 0;
			ret[1] = 1;
		} else if (board[0][0] == 'O' && board[2][0] == 'O' && board[1][0] == '-') {
			ret[0] = 1;
			ret[1] = 0;
		} else if (board[0][2] == 'O' && board[2][2] == 'O' && board[1][2] == '-') {
			ret[0] = 1;
			ret[1] = 2;
		} else if (board[2][0] == 'O' && board[2][2] == 'O' && board[2][1] == '-') {
			ret[0] = 2;
			ret[1] = 1;
		} else if (board[0][0] == 'O' && board[2][2] == 'O' && board[1][1] == '-') {
			ret[0] = 1;
			ret[1] = 1;
		} else if (board[0][2] == 'O' && board[2][0] == 'O' && board[1][1] == '-') {
			ret[0] = 1;
			ret[1] = 1;
		} else if (board[0][1] == 'O' && board[2][1] == 'O' && board[1][1] == '-') {
			ret[0] = 1;
			ret[1] = 1;
		} else if (board[1][0] == 'O' && board[1][2] == 'O' && board[1][1] == '-') {
			ret[0] = 1;
			ret[1] = 1;
		}
		return ret;
	}

	public static int[] userNotWinningMyMove() {
		int[] ret = new int[2];
		ret[0] = 5;
		if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == '-') {
			ret[0] = 0;
			ret[1] = 2;
		} else if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == '-') {
			ret[0] = 2;
			ret[1] = 0;
		} else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == '-') {
			ret[0] = 2;
			ret[1] = 2;
		} else if (board[0][1] == 'X' && board[0][2] == 'X' && board[0][0] == '-') {
			ret[0] = 0;
			ret[1] = 0;
		} else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == '-') {
			ret[0] = 2;
			ret[1] = 1;
		} else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == '-') {
			ret[0] = 2;
			ret[1] = 0;
		} else if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == '-') {
			ret[0] = 2;
			ret[1] = 2;
		} else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == '-') {
			ret[0] = 1;
			ret[1] = 2;
		} else if (board[1][0] == 'X' && board[2][0] == 'X' && board[0][0] == '-') {
			ret[0] = 0;
			ret[1] = 0;
		} else if (board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == '-') {
			ret[0] = 0;
			ret[1] = 2;
		} else if (board[2][1] == 'X' && board[1][1] == 'X' && board[0][1] == '-') {
			ret[0] = 0;
			ret[1] = 1;
		} else if (board[2][2] == 'X' && board[1][1] == 'X' && board[0][0] == '-') {
			ret[0] = 0;
			ret[1] = 0;
		} else if (board[1][1] == 'X' && board[1][2] == 'X' && board[1][0] == '-') {
			ret[0] = 1;
			ret[1] = 0;
		} else if (board[2][2] == 'X' && board[1][2] == 'X' && board[0][2] == '-') {
			ret[0] = 0;
			ret[1] = 2;
		} else if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == '-') {
			ret[0] = 2;
			ret[1] = 2;
		} else if (board[2][1] == 'X' && board[2][2] == 'X' && board[2][0] == '-') {
			ret[0] = 2;
			ret[1] = 0;
		} else if (board[0][0] == 'X' && board[0][2] == 'X' && board[0][1] == '-') {
			ret[0] = 0;
			ret[1] = 1;
		} else if (board[0][0] == 'X' && board[2][0] == 'X' && board[1][0] == '-') {
			ret[0] = 1;
			ret[1] = 0;
		} else if (board[0][2] == 'X' && board[2][2] == 'X' && board[1][2] == '-') {
			ret[0] = 1;
			ret[1] = 2;
		} else if (board[2][0] == 'X' && board[2][2] == 'X' && board[2][1] == '-') {
			ret[0] = 2;
			ret[1] = 1;
		} else if (board[0][0] == 'X' && board[2][2] == 'X' && board[1][1] == '-') {
			ret[0] = 1;
			ret[1] = 1;
		} else if (board[0][2] == 'X' && board[2][0] == 'X' && board[1][1] == '-') {
			ret[0] = 1;
			ret[1] = 1;
		} else if (board[0][1] == 'X' && board[2][1] == 'X' && board[1][1] == '-') {
			ret[0] = 1;
			ret[1] = 1;
		} else if (board[1][0] == 'X' && board[1][2] == 'X' && board[1][1] == '-') {
			ret[0] = 1;
			ret[1] = 1;
		}
		return ret;
	}

	public static int[] noOtherOption() {
		int[] ret = new int[2];
		ret[0] = 5;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == '-') {
					ret[0] = i;
					ret[1] = j;
					break;
				}
			}
			if (ret[0] != 5) {
				break;
			}
			// System.out.println();
		}

		return ret;
	}

	public static void hMove() {
		// <editor-fold defaultstate="collapsed" desc="first move of the computer">
		if (counter == 1) {
			// if the human moved in the center
			if (board[1][1] == 'O') {
				Random rand = new Random();
				int f = rand.nextInt(4) + 1;
				if (f == 1) {
					// then it is 00
					board[0][0] = 'X';
					firstMove = "00";
					// System.out.println("CHECK");
				} else if (f == 2) {
					// then it is 00
					board[0][2] = 'X';
					firstMove = "02";
					// System.out.println("CHECK");
				} else if (f == 3) {
					// then it is 00
					board[2][0] = 'X';
					firstMove = "20";
					// System.out.println("CHECK");
				} else if (f == 4) {
					// then it is 00
					board[2][2] = 'X';
					firstMove = "22";
					// System.out.println("CHECK");
				} else {
					// then it is 00
					board[2][2] = 'X';
					firstMove = "22";
					// System.out.println("CHECK");
				}
			} else if (board[0][0] == 'O') {
				board[1][1] = 'X';
				firstMove = "11";
			} else if (board[0][2] == 'O') {
				board[1][1] = 'X';
				firstMove = "11";
			} else if (board[2][0] == 'O') {
				board[1][1] = 'X';
				firstMove = "11";
			} else {
				board[1][1] = 'X';
				firstMove = "11";
			}

		}

		if (counter == 2) {
			int second[] = stopUserFromWinningMove();
			// if there is no defensice move
			if (second[0] == 5) {
				if (board[1][1] != 'X') {
					if (firstMove == "00" && board[0][2] == '-') {
						board[0][2] = 'X';
					} else if (firstMove == "00" && board[2][0] == '-') {
						board[2][0] = 'X';
					} else if (firstMove == "02" && board[0][0] == '-') {
						board[0][0] = 'X';
					} else if (firstMove == "02" && board[2][2] == '-') {
						board[2][2] = 'X';
					} else if (firstMove == "20" && board[0][0] == '-') {
						board[0][0] = 'X';
					} else if (firstMove == "20" && board[2][2] == '-') {
						board[2][2] = 'X';
					} else if (firstMove == "22" && board[2][0] == '-') {
						board[2][0] = 'X';
					} else if (firstMove == "22" && board[0][2] == '-') {
						board[0][2] = 'X';
					}
				} else {
					if (board[0][0] == '-') {
						board[0][0] = 'X';
					} else if (board[0][2] == '-') {
						board[0][2] = 'X';
					} else if (board[2][0] == '-') {
						board[2][0] = 'X';
					} else if (board[2][2] == '-') {
						board[2][2] = 'X';
					}
				}

			}
			// if there is a defensive move
			else {
				board[second[0]][second[1]] = 'X';
			}

		}

		if (counter == 3) {
			if (!end) {
				int second[] = stopUserFromWinningMove();
				if (second[0] != 5) {
					// System.out.println("CHECK");
					board[second[0]][second[1]] = 'X';
				} else {
					int secondMy[] = userNotWinningMyMove();
					if (secondMy[0] != 5) {
						board[secondMy[0]][secondMy[1]] = 'X';
					} else {
						secondMy = noOtherOption();
						board[secondMy[0]][secondMy[1]] = 'X';
					}
				}
			}
			if (!end) {
				end = true;
				win = 'd';
			}
			end = won();
		}

		if (counter == 4) {

			if (!end) {
				int second[] = stopUserFromWinningMove();
				if (second[0] != 5) {
					// System.out.println("CHECK");
					board[second[0]][second[1]] = 'X';
				} else {
					int secondMy[] = userNotWinningMyMove();
					if (secondMy[0] != 5) {
						board[secondMy[0]][secondMy[1]] = 'X';
					} else {
						secondMy = noOtherOption();
						board[secondMy[0]][secondMy[1]] = 'X';
					}
				}
			}
			if (!end) {
				end = true;
				win = 'd';
			}
			won();
		}

		if (counter == 5) {

			won();

			if (!end) {
				int second[] = stopUserFromWinningMove();
				if (second[0] != 5) {
					// System.out.println("CHECK");
					board[second[0]][second[1]] = 'X';
				} else {
					int secondMy[] = userNotWinningMyMove();
					if (secondMy[0] != 5) {
						board[secondMy[0]][secondMy[1]] = 'X';
					} else {
						secondMy = noOtherOption();
						board[secondMy[0]][secondMy[1]] = 'X';
					}
				}
			}

		}

		counter++;
	}

	public static boolean won() {
		boolean won = false;

		if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
			won = true;
			win = 'o';
		} else if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') {
			won = true;
			win = 'o';
		} else if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
			won = true;
			win = 'o';
		} else if (board[0][1] == 'O' && board[0][2] == 'O' && board[0][0] == 'O') {
			won = true;
			win = 'o';
		} else if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') {
			won = true;
			win = 'o';
		} else if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
			won = true;
			win = 'o';
		} else if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
			won = true;
			win = 'o';
		} else if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
			won = true;
			win = 'o';
		} else if (board[1][0] == 'O' && board[2][0] == 'O' && board[0][0] == 'O') {
			won = true;
			win = 'o';
		} else if (board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O') {
			won = true;
			win = 'o';
		} else if (board[2][1] == 'O' && board[1][1] == 'O' && board[0][1] == 'O') {
			won = true;
			win = 'o';
		} else if (board[2][2] == 'O' && board[1][1] == 'O' && board[0][0] == 'O') {
			won = true;
			win = 'o';
		} else if (board[1][1] == 'O' && board[1][2] == 'O' && board[1][0] == 'O') {
			won = true;
			win = 'o';
		} else if (board[2][2] == 'O' && board[1][2] == 'O' && board[0][2] == 'O') {
			won = true;
			win = 'o';
		} else if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
			won = true;
			win = 'o';
		} else if (board[2][1] == 'O' && board[2][2] == 'O' && board[2][0] == 'O') {
			won = true;
			win = 'o';
		} else if (board[0][0] == 'O' && board[0][2] == 'O' && board[0][1] == 'O') {
			won = true;
			win = 'o';
		} else if (board[0][0] == 'O' && board[2][0] == 'O' && board[1][0] == 'O') {
			won = true;
			win = 'o';
		} else if (board[0][2] == 'O' && board[2][2] == 'O' && board[1][2] == 'O') {
			won = true;
			win = 'o';
		} else if (board[2][0] == 'O' && board[2][2] == 'O' && board[2][1] == 'O') {
			won = true;
			win = 'o';
		} else if (board[0][0] == 'O' && board[2][2] == 'O' && board[1][1] == 'O') {
			won = true;
			win = 'o';
		} else if (board[0][2] == 'O' && board[2][0] == 'O' && board[1][1] == 'O') {
			won = true;
			win = 'o';
		} else if (board[0][1] == 'O' && board[2][1] == 'O' && board[1][1] == 'O') {
			won = true;
			win = 'o';
		} else if (board[1][0] == 'O' && board[1][2] == 'O' && board[1][1] == 'O') {
			won = true;
			win = 'o';
		}

		if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
			won = true;
			win = 'X';
		} else if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
			won = true;
			win = 'X';
		} else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
			won = true;
			win = 'X';
		} else if (board[0][1] == 'X' && board[0][2] == 'X' && board[0][0] == 'X') {
			won = true;
			win = 'X';
		} else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
			won = true;
			win = 'X';
		} else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
			won = true;
			win = 'X';
		} else if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
			won = true;
			win = 'X';
		} else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
			won = true;
			win = 'X';
		} else if (board[1][0] == 'X' && board[2][0] == 'X' && board[0][0] == 'X') {
			won = true;
			win = 'X';
		} else if (board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X') {
			won = true;
			win = 'X';
		} else if (board[2][1] == 'X' && board[1][1] == 'X' && board[0][1] == 'X') {
			won = true;
			win = 'X';
		} else if (board[2][2] == 'X' && board[1][1] == 'X' && board[0][0] == 'X') {
			won = true;
			win = 'X';
		} else if (board[1][1] == 'X' && board[1][2] == 'X' && board[1][0] == 'X') {
			won = true;
			win = 'X';
		} else if (board[2][2] == 'X' && board[1][2] == 'X' && board[0][2] == 'X') {
			won = true;
			win = 'X';
		} else if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
			won = true;
			win = 'X';
		} else if (board[2][1] == 'X' && board[2][2] == 'X' && board[2][0] == 'X') {
			won = true;
			win = 'X';
		} else if (board[0][0] == 'X' && board[0][2] == 'X' && board[0][1] == 'X') {
			won = true;
			win = 'X';
		} else if (board[0][0] == 'X' && board[2][0] == 'X' && board[1][0] == 'X') {
			won = true;
			win = 'X';
		} else if (board[0][2] == 'X' && board[2][2] == 'X' && board[1][2] == 'X') {
			won = true;
			win = 'X';
		} else if (board[2][0] == 'X' && board[2][2] == 'X' && board[2][1] == 'X') {
			won = true;
			win = 'X';
		} else if (board[0][0] == 'X' && board[2][2] == 'X' && board[1][1] == 'X') {
			won = true;
			win = 'X';
		} else if (board[0][2] == 'X' && board[2][0] == 'X' && board[1][1] == 'X') {
			won = true;
			win = 'X';
		} else if (board[0][1] == 'X' && board[2][1] == 'X' && board[1][1] == 'X') {
			won = true;
			win = 'X';
		} else if (board[1][0] == 'X' && board[1][2] == 'X' && board[1][1] == 'X') {
			won = true;
			win = 'X';
		}

		boolean dash = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == '-') {
					dash = false;
				}
			}
		}

		if (dash) {
			win = 'd';
			won = true;
		}

		return won;
	}

	public static void printBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

}
