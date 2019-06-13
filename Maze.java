public class Maze {
    private boolean[][] maze;

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
	int row = maze.row();
	int column = maze.column();
	String pic = INDENT + row + "*" + column + " maze"
	    + "with walls"
	    + wallCordinates;
	
}
