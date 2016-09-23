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
public class Chess {
    int startY;//start position on a X,Y axis
    int x1, x2, x3, x4, x5, x6, x7, x8;
    int y;
    String objectColor;//Object Color: 0 is black, 1 is white
    String squareColor1;
    String squareColor2;
    String objectName;
    
    
    public Chess(String name, String color){
        objectName = name;
        if(color.equalsIgnoreCase("white")){
            objectColor = color;
        }
        if(color.equalsIgnoreCase("Black")){
            objectColor = color;
        }
        else{
            System.out.println("Please select either white or black as object color");
        }
    }
    
    public void squareColor(){
        if(objectColor.equalsIgnoreCase("black")){
            if(objectName.equalsIgnoreCase("king")){
                squareColor1 = "white";
                squareColor2 = "NA";
                System.out.println("Square color 1: "+squareColor1);
                System.out.println("Square color 2: "+squareColor2);
            }
            if(objectName.equalsIgnoreCase("queen")){
                squareColor1 = "black";
                squareColor2 = "NA";
                System.out.println("Square color 1: "+squareColor1);
                System.out.println("Square color 2: "+squareColor2);
            }
            if(objectName.equalsIgnoreCase("rook")){
                //from left to right of board
                squareColor1 = "white";
                squareColor2 = "black";
                System.out.println("Square color 1: "+squareColor1);
                System.out.println("Square color 2: "+squareColor2);
            }
            if(objectName.equalsIgnoreCase("bishop")){
                //from left to right of board
                squareColor1 = "white";
                squareColor2 = "black";
                System.out.println("Square color 1: "+squareColor1);
                System.out.println("Square color 2: "+squareColor2);
            }
            if(objectName.equalsIgnoreCase("knight")){
                //from left to right of board
                squareColor1 = "black";
                squareColor2 = "white";
                System.out.println("Square color 1: "+squareColor1);
                System.out.println("Square color 2: "+squareColor2);
            }
            if(objectName.equalsIgnoreCase("pawn")){
                //from left to right of board
                squareColor1 = "black";
                squareColor2 = "white";
                System.out.println("Square color 1: "+squareColor1);
                System.out.println("Square color 2: "+squareColor2);
            }
        }
        else if(objectColor.equalsIgnoreCase("white")){
            if(objectName.equalsIgnoreCase("king")){
                squareColor1 = "black";
                squareColor2 = "NA";
                System.out.println("Square color 1: "+squareColor1);
                System.out.println("Square color 2: "+squareColor2);
            }
            if(objectName.equalsIgnoreCase("queen")){
                squareColor1 = "white";
                squareColor2 = "NA";
                System.out.println("Square color 1: "+squareColor1);
                System.out.println("Square color 2: "+squareColor2);
            }
            if(objectName.equalsIgnoreCase("rook")){
                //from left to right of board
                squareColor1 = "black";
                squareColor2 = "white";
                System.out.println("Square color 1: "+squareColor1);
                System.out.println("Square color 2: "+squareColor2);
            }
            if(objectName.equalsIgnoreCase("bishop")){
                //from left to right of board
                squareColor1 = "black";
                squareColor2 = "white";
                System.out.println("Square color 1: "+squareColor1);
                System.out.println("Square color 2: "+squareColor2);
            }
            if(objectName.equalsIgnoreCase("knight")){
                //from left to right of board
                squareColor1 = "white";
                squareColor2 = "black";
                System.out.println("Square color 1: "+squareColor1);
                System.out.println("Square color 2: "+squareColor2);
            }
            if(objectName.equalsIgnoreCase("pawn")){
                //from left to right of board
                squareColor1 = "white";
                squareColor2 = "black";
                System.out.println("Square color 1: "+squareColor1);
                System.out.println("Square color 2: "+squareColor2);
            }
        }
        else{
            System.out.println("Error!");
        }
        
    }
    
    //accessor methods or getter
    public String getObjectName(){
        return objectName;
    }
    
    public String getObjectColor(){
        return objectColor;
    }
    
}
