package joseBeta;
/*
 * Pawn.java
 * @author Humberto Martinez
 * @version 1.0
 */

public class Pawn extends Piece
{
	
	String name;
	String team;
	int row;
	int column;
	/*
	 * Constructor for Pawn class
	 * @param n name of the piece
	 * @param t Team color of the piece
	 * @param y Y coordinate of the piece(row #)
	 * @param x X coordinate of the piece(column #)
	 */

	public Pawn(String n, String t, int y, int x)
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
		if(team.equals("Black"))
		{
			String preCoords;
			preCoords ="" + (row + 1) +(column);
			preCoords += "" + (row + 2) +(column);
			preCoords += "" + ( row + 1) + (column + 1);
			preCoords += "" + ( row + 1) + (column - 1);
			return preCoords;
		}
		else
		{
			String preCoords;
			preCoords ="" + (row - 1) +(column);
			preCoords += "" + (row - 2) +(column);
			preCoords += "" + ( row - 1) + (column + 1);
			preCoords += "" + ( row - 1) + (column - 1);
			return preCoords;
		}
	}
}