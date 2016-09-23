/*
    //Superclass here defines all that is common across all chess piece object.
    //All chess piece object has a color and where on the board that they start.
    //They also have movements but this movements are not defined here because
    //we want to place them in each unique chess piece class of their own where they can be uniquely defined.
    //for instance a rook will not have a diagnonal movement whereas a bishop will.
    //if we defined a diagonal movement here, it will only make sense for the bishop to inherit it and not the rook.
    //To avoid any unused inheritance not shared by all pieces, we simply define them in their own class
    //this way, when an object from an application creates a piece, it only has access to instances and methods defined in
    //its own class category and that of the superclass called SuperChess.
    //what this mean is that a rook only has access to rook behaviors and general behaviors like color and starting position
    //which is shared by all chess piece object regardless of what type they are.
 */
package Chapter1;

/**
 *
 * @author javao
 */
public class SuperChess {
    private String name = "King";
    private String color = "Black";
    private int startingPositionX, startingPositionY;
    
    public String getName(String name){
        this.name = name;
        return name;
    }
    
    public String getColor(String color){
        this.color = color;
        return color;
    }
    
    public int getStartingPositionX(int startingPositionX){
        this.startingPositionX = startingPositionX;
        return startingPositionX;
    }
    
    public int getStartingPositionY(int startingPositionY){
        this.startingPositionY = startingPositionY;
        return startingPositionY;
    }
    
    public void printAttributes(){
        System.out.println("Name of object: "+name);
        System.out.println("Color of object: "+color);
        System.out.println("Starting ROW position: "+startingPositionX);
        System.out.println("Starting COLUMN position: "+startingPositionY);
    }
    
}
