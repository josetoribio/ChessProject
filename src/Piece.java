public class Piece {
    private String t;
    private String n;
    int row;
    int collum;
//constructor
public Piece(String name,String color1,int row1,int collum1 )
{
    n = name;
    t = color1;
    row = row1;
    collum = collum1;

}
//gets the x coordinate
public int  getrow(){return getrow();}
//gets the y coordinate
public int  getCollum(){return getCollum();}


public void setLocation(int new_collum,int new_row){row = new_row; collum = new_collum;}

public  String movement_Type(){
    String coords="";
    return coords;
}
}
