import java.util.ArrayList;

public class Maze {
    private boolean[][] maze;
    private static final String INDENT = "         ";
    public Maze( int row, int column){
	maze = new boolean[row][column];
    }

    public int row() {
	return maze.length;
    }

    public int column() {
	if (maze.length != 0)
	    return maze[0].length;
	else
	    return 0;
    }

    public String toString() {
	int row = row();
	int column = column();
	ArrayList<String> wallCoordinates = new ArrayList<String>();
	for (int i = 0; i < row; i++)
	    for (int j = 0; j < column; j++)
		if (maze[i][j] == false)
		    wallCoordinates.add("[" + i + "," + j + "] ");
	String pic = System.lineSeparator()
	    + INDENT + row + "*" + column + " maze "
    	    + "with walls: "
	    + System.lineSeparator()
	    + wallCoordinates;
	
	String underscores = "";
	
	if (row == 0 & column == 0) return pic;
	
	pic += INDENT + "columns" + System.lineSeparator() +INDENT;
	
	for (int c = 0; c < column; c++){
	    pic += String.format("%-3d", c);
	    underscores += "ooo";
	}

	pic += INDENT + underscores + System.lineSeparator();
	
	for(int r = 0; r < row; r++){
            pic += String.format("r %2d|", r);
            for( int c  = 0; c < column; c++)
		if (maze[r][c])
		    pic += "_";
		else
	            pic += " X ";
            pic += System.lineSeparator();
	}
	return pic;
	}
}
