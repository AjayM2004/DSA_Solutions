package Backtracking.basics;

import java.util.Scanner;

public class Nqueens {
    static boolean isSafe(boolean[][] board,int row,int col)
    {
        for(int i=0;i<row;i++)
        {
            if(board[i][col])
            {
                return false;
            }
        }
      return true;
    }

    static void nQueens(boolean[][] board,int row)
    {
        if(board.length==row)
        {
            return;
       }
          for(int col=0;col<board[0].length;col++)
          {
              board[row][col]=true;
              if(isSafe(board,row,col))
              {
                  nQueens(board,row+1);
              }
              board[row][col]=false;
          }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean[][] board = new boolean[n][n];
        nQueens(board,0);
    }
}
