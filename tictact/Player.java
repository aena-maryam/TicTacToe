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
public class Player {
    int player, count, player1count, player2count;
    String turn, win;
    boolean p1, p2;
    Board board;
    
    Player()
    {
        player=-1;
        count=1;
        player1count=0;
        player2count=0;
        board=new Board();
    }
    Player(int which)
    {
        player=which;
    }

    void printPlayer()
    {
        System.out.println();
    }
    int getPlayer()
    {
        return player;
    }
    
    void incrementCount()
    {
        count++;
    }
    String calculatePlayerTurn()
    {
        if(count%2==1)
        {
            turn="Player1's turn";
            p1=true;
            p2=false;
        }
        else if(count%2==0)
        {
            turn="Player2's turn";
            p1=false;
            p2=true;
        }
        return turn;
    }
    
    int getCount()
    {
        return count;
    }
    boolean getp1()
    {
        return p1;
    }
    boolean getp2()
    {
        return p2;
    }
    void markPlayerA(int i, int j)
    {
        board.setPlayerA(i, j);
    }
    void markPlayerB(int i, int j)
    {
        board.setPlayerB(i, j);
    }
    
    String calculateWin()
    {
        int b[][]=new int[3][3];
        b=board.getBoard();
        if((b[0][0]==1 && b[0][1]==1 && b[0][2]==1) || (b[0][0]==1 &&b[1][0]==1 && b[2][0]==1) || (b[0][2]==1 &&b[1][2]==1 && b[2][2]==1) || (b[2][0]==1 &&b[2][1]==1 && b[2][2]==1) || (b[0][0]==1 &&b[1][1]==1 && b[2][2]==1) || (b[0][2]==1 &&b[1][1]==1 && b[2][0]==1) || (b[0][1]==1 &&b[1][1]==1 && b[2][1]==1) || (b[1][0]==1 &&b[1][1]==1 && b[1][2]==1))
        {
            win="Player1 Wins";
        }
        else if((b[0][0]==2 && b[0][1]==2 && b[0][2]==2) || (b[0][0]==2 &&b[1][0]==2 && b[2][0]==2) || (b[0][2]==2 &&b[1][2]==2 && b[2][2]==2) || (b[2][0]==2 &&b[2][1]==2 && b[2][2]==2) || (b[0][0]==2 &&b[1][1]==2 && b[2][2]==2) || (b[0][2]==2 &&b[1][1]==2 && b[2][0]==2) || (b[0][1]==2 &&b[1][1]==2 && b[2][1]==2) || (b[1][0]==2 &&b[1][1]==2 && b[1][2]==2))
        {
            win="Player2 Wins";
        }
        else if(b[0][0]!=-1 && b[0][1] !=-1 && b[0][2] !=-1 && b[1][0]!=-1 && b[1][1]!=-1 && b[1][2] !=-1 && b[2][0]!=-1 && b[2][1]!=-1 && b[2][2]!=-1)
        {
            win="Game Draws";
        }
        return win;
    }
    
    void markBoard(char ch)
    {
        board.setSymbol(ch);
    }
}
