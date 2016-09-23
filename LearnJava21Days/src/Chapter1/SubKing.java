/*
    //Notice I don't have to define color or position here since I inherit it from the SuperChess class.
    //This program like the SuperChess class will not run as an application.
    //We will create an object later in an application called ChessInheritanceApplication to put both the
    //SubKing and SuperChess class to use.
    //The SuperChess and SubKing class is an illustration of Inheritance.
    //static keyword is used to create class instances and methods unique to the class itself.
    //I also use final keyword to indicate variables which are constant and not vulnerable to external changes.
    //private keyword adds another level of security to prevent external access outside from this class.
    //accessor methods like get are also not defined to access any of these variables from the outside.
    //mutator methods like forwardStep etc defined here simply prints the value of each variables.
 */
package Chapter1;

/**
 *
 * @author javao
 */
public class SubKing extends SuperChess{
     
    //possible steps a kind have
    private static final int FORWARD = 1;
    private static final int BACKWARD = 1;
    private static final int SIDELEFT = 1;
    private static final int SIDERIGHT = 1;
    private static final int DIAGONAL = 1;
    
    public void forwardStep(){
        System.out.println("King has moved forward by " +FORWARD+" step");
    }
    
    public void backwardStep(){
        System.out.println("King has moved backward by " +BACKWARD+" step");
    }
    
    public void sideStepLeft(){
        System.out.println("King has moved left by " +SIDELEFT+" step");
    }
    
    public void sideStepRight(){
        System.out.println("King has moved right by " +SIDERIGHT+" step");
    }
    
    public void diagonalStep(){
        System.out.println("King has moved diagonally by " +DIAGONAL+" step");
    }
    
    
    
}
