
/*
 * Queen.java
 * @author Humberto Martinez
 * @version 1.0
 */

public class Queen extends Piece
{
	
	String name;
	String team;
	int row;
	int column;
	/*
 * Constructor for Queen class
	 * @param n name of the piece
	 * @param t Team color of the piece
	 * @param y Y coordinate of the piece(row #)
	 * @param x X coordinate of the piece(column #)
	 */

	public Queen(String n, String t, int y, int x)
	{
		super(n, t, y, x);
		/*
		name = n;
		team = t;
		column = y;
		row = x;
		**/
	}
	public int getColumn()
	{
		return column;
	}
	public int getRow()
	{
		return row;
	}
	/*
	 * Method for changing the stored location of the piece
	 * @param newColumn The column # of where the piece will go
	 * @param newRow The row # of where the piece will go
	 */
	public void setLocation(int newColumn, int newRow)
	{
		column = newColumn;
		row = newRow;
	}
	public String getMovementType()
	{
		String possible_movements;
		// Starts top left, goes in a complete circle, ends at coordinate left to it
		possible_movements = "" + (row - 1)+ (column -1);
		possible_movements = possible_movements +  "" + (row - 1)+ (column);
		possible_movements = possible_movements +  "" + (row - 1)+ (column +1);
		possible_movements = possible_movements +  "" + (row )+ (column +1);
		possible_movements = possible_movements +  "" + (row + 1)+ (column +1);
		possible_movements = possible_movements +  "" + (row + 1)+ (column);
		possible_movements = possible_movements +  "" + (row + 1)+ (column -1);
		possible_movements = possible_movements +  "" + (row )+ (column -1);
		//-----------------------------------------------------------------------
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
		//-----------------------------------------------------------------------




		return possible_movements;
	}
}

