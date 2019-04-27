public class rook extends Piece {

    private String team;
    private String name;
    int row;
    int column;
    public rook(String name,String color1,int row1,int collum1 )
    {
        super(name,color1,row1,collum1);



    }


    public String movement_Type() {
        String possible_movements="";
        //moves up
        possible_movements = possible_movements+""+(row)+""+(collum+1);
        possible_movements = possible_movements+""+(row)+""+(collum+2);
        possible_movements = possible_movements+""+(row)+""+(collum+3);
        possible_movements = possible_movements+""+(row)+""+(collum+4);
        possible_movements = possible_movements+""+(row)+""+(collum+5);
        possible_movements = possible_movements+""+(row)+""+(collum+6);
        possible_movements = possible_movements+""+(row)+""+(collum+7);
        //moves down
        possible_movements = possible_movements+""+(row)+""+(collum-1);
        possible_movements = possible_movements+""+(row)+""+(collum-2);
        possible_movements = possible_movements+""+(row)+""+(collum-3);
        possible_movements = possible_movements+""+(row)+""+(collum-4);
        possible_movements = possible_movements+""+(row)+""+(collum-5);
        possible_movements = possible_movements+""+(row)+""+(collum-6);
        possible_movements = possible_movements+""+(row)+""+(collum-7);
        //moves left
        possible_movements = possible_movements+""+(row-1)+""+(collum);
        possible_movements = possible_movements+""+(row-2)+""+(collum);
        possible_movements = possible_movements+""+(row-3)+""+(collum);
        possible_movements = possible_movements+""+(row-4)+""+(collum);
        possible_movements = possible_movements+""+(row-5)+""+(collum);
        possible_movements = possible_movements+""+(row-6)+""+(collum);
        possible_movements = possible_movements+""+(row-7)+""+(collum);
        //moves right
        possible_movements = possible_movements+""+(row+1)+""+(collum);
        possible_movements = possible_movements+""+(row+2)+""+(collum);
        possible_movements = possible_movements+""+(row+3)+""+(collum);
        possible_movements = possible_movements+""+(row+4)+""+(collum);
        possible_movements = possible_movements+""+(row+5)+""+(collum);
        possible_movements = possible_movements+""+(row+6)+""+(collum);
        possible_movements = possible_movements+""+(row+7)+""+(collum);




        return possible_movements;

    }
    public int getColumn()
    {
        return column;
    }
    public int getRow()
    {
        return row;
    }

    public void setLocation(int newColumn, int newRow)
    {
        column = newColumn;
        row = newRow;
    }
}
