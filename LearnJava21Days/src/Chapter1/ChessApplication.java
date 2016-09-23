/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1;

/**
 *
 * @author javao
 */
public class ChessApplication {
    public static void main(String[] args){
        Chess chessObj = new Chess("pawn", "white");
               
        String name = chessObj.getObjectName();//instance variable name
        String color = chessObj.getObjectColor();//instance variable color
        System.out.println("Chess piece name: "+name);//returns the name of chess piece
        System.out.println("Chess piece color: "+color);//returns the color of chess piece
        chessObj.squareColor();//returns the square color options for chess piece from left to right 
        
    }
}
