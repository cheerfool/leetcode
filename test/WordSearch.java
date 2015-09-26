package test;

public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board= {
				"ABCE".toCharArray(),
				"SFCS".toCharArray(),
				"ADEE".toCharArray()
		};
		System.out.println(exist(board, "SEEE"));
	}

	public static boolean exist(char[][] board, String word) {
		if (board.length < 1)
			return false;
		if (board[0].length < 1)
			return false;
		if (word.length() < 1)
			return false;
		int xlen = board[0].length;
		int ylen = board.length;
		char ch = word.charAt(0);
		for (int i = 0; i < xlen; i++) {
			for (int j = 0; j < ylen; j++) {
				if (board[j][i] == ch) {
					if (word.length() == 1)
						return true;
					else if (find(board, i, j, word.substring(1)))
						return true;
				}
			}
		};
		return false;
	}

	public static boolean find(char[][] board, int x, int y, String target) {
		int xlen = board[0].length;
		int ylen = board.length;
		int len = target.length();
		char ch = target.charAt(0);

		int[][] neighbors = { { x - 1, y }, { x + 1, y }, { x, y - 1 },
				{ x, y + 1 } };
		for (int[] coord : neighbors) {
			int i = coord[0];
			int j = coord[1];
			if (i >= 0 && j >= 0 && i < xlen && j < ylen) {
				if (board[j][i] == ch) {
					if (len == 1)
						return true;
					else if (find(board, i, j, target.substring(1)))
						return true;
				}
			}
		};
		return false;
	}

}
