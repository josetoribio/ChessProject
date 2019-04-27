public class bishop extends Piece {

    private String team;
    private String name;
    int row;
    int column;
    public bishop(String name,String color1,int row1,int collumn1 )
    {
        super(name,color1,row1,collumn1);



    }


    public String movement_Type() {
        String possible_movements="";
        //moves diagonally up left
        possible_movements = possible_movements+""+(row-1)+""+(collum-1);
        possible_movements = possible_movements+""+(row-2)+""+(collum-2);
        possible_movements = possible_movements+""+(row-3)+""+(collum-3);
        possible_movements = possible_movements+""+(row-4)+""+(collum-4);
        possible_movements = possible_movements+""+(row-5)+""+(collum-5);
        possible_movements = possible_movements+""+(row-6)+""+(collum-6);
        possible_movements = possible_movements+""+(row-7)+""+(collum-7);
        //moves diagonally up right
        possible_movements = possible_movements+""+(row+1)+""+(collum-1);
        possible_movements = possible_movements+""+(row+2)+""+(collum-2);
        possible_movements = possible_movements+""+(row+3)+""+(collum-3);
        possible_movements = possible_movements+""+(row+4)+""+(collum-4);
        possible_movements = possible_movements+""+(row+5)+""+(collum-5);
        possible_movements = possible_movements+""+(row+6)+""+(collum-6);
        possible_movements = possible_movements+""+(row+7)+""+(collum-7);
        //moves diagonally down left
        possible_movements = possible_movements+""+(row-1)+""+(collum+1);
        possible_movements = possible_movements+""+(row-2)+""+(collum+2);
        possible_movements = possible_movements+""+(row-3)+""+(collum+3);
        possible_movements = possible_movements+""+(row-4)+""+(collum+4);
        possible_movements = possible_movements+""+(row-5)+""+(collum+5);
        possible_movements = possible_movements+""+(row-6)+""+(collum+6);
        possible_movements = possible_movements+""+(row-7)+""+(collum+7);
        //moves diagonally down right
        possible_movements = possible_movements+""+(row+1)+""+(collum+1);
        possible_movements = possible_movements+""+(row+2)+""+(collum+2);
        possible_movements = possible_movements+""+(row+3)+""+(collum+3);
        possible_movements = possible_movements+""+(row+4)+""+(collum+4);
        possible_movements = possible_movements+""+(row+5)+""+(collum+5);
        possible_movements = possible_movements+""+(row+6)+""+(collum+6);
        possible_movements = possible_movements+""+(row+7)+""+(collum+7);



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
