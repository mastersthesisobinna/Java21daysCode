/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1;

/**
 *
 * @author javao
 */
public class ChessInheritanceApplication {
    public static void main(String args[]){
        
        System.out.println("**OBJECT 1**");
        //king creates a new SubKing object on the chess board.
        //SubKing class inherits several methods defined in SuperChess class which is common to all piece.
        //SubKing defines its own differentiating methods unique to king objects only.
        //this methods uses constant class variables to define the unique behavior of a king object.
        
        SubKing king = new SubKing();
        king.getName("King");//from SuperChess
        king.getColor("White");//from SuperChess
        king.getStartingPositionX(1);//from SuperChess
        king.getStartingPositionY(5);//from SuperChess
        //print the king object attributes
        king.printAttributes();//from SuperChess        
        System.out.println("===================================================");
        //Assign the king object some movement
        //here I assign all its object
        king.forwardStep();//from SubKing
        king.backwardStep();//from SubKing
        king.sideStepLeft();//from SubKing
        king.sideStepRight();//from SubKing
        king.diagonalStep();//from SubKing
        System.out.println("===================================================");
        System.out.println("");
        System.out.println("");
        
        System.out.println("**OBJECT 2**");
        //define another king object this time give it only access to two of SubKing's movement
        SubKing king2 = new SubKing();        
        king2.getColor("Black");//we can even set a default color for all king object in the SuperChess class if we wanted.
        king2.getStartingPositionX(8);//this will be the opposite end of the board for example.
        king2.getStartingPositionY(5);//starts in the same column as our previous king but on the opposite end.
        king2.printAttributes();//we get the attributes of king2
        System.out.println("===================================================");
        king2.forwardStep();
        king2.forwardStep();//we've made an assumption that the king moves two forward steps.
        System.out.println("===================================================");
        
        
        
        //notice that the name of object is printed as King even if I did not explictly assign that name
        //this is because I set the defualt name of a chess object to a Queen.
        //regardless of what the chess piece is, I have made the assumption that the piece will hold by default a Queen type
        //unless otherwise started as done above when I set the king object to "King" using an accessor method.
        
        
    }
}
