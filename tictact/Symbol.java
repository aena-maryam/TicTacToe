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
public class Symbol {
    char symbol;
    
    Symbol()
    {
        symbol='\0';
    }
    Symbol(char sym)
    {
        symbol=sym;
    }
    char getSymbol()
    {
        return symbol;
    }
    void setX()
    {
        symbol='X';
    }
    void setO()
    {
        symbol='O';
    }
}
