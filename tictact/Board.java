/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictact;

/**
 *
 * @author aenam
 */
public class Board {
    int board[][];
    Symbol symbol;
    
    Board()
    {
        board=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                board[i][j]=-1;
            }
        }
        symbol=new Symbol();
    }
    
    void setPlayerA(int i, int j)
    {
        board[i][j]=1;
    }
    void setPlayerB(int i, int j)
    {
        board[i][j]=2;
    }
    int[][] getBoard()
    {
        return board;
    }
    char getSymbol()
    {
        char s=symbol.getSymbol();
        return s;
    }
    void setSymbol(char ch)
    {
        if(ch=='X')
        {
            symbol.setX();
        }
        else if(ch=='O')
        {
            symbol.setO();
        }
    }
}
