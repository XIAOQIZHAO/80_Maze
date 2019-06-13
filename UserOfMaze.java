public class UserOfMaze {
    public static void main (String[] commandLine) {
	Maze maze = new Maze( 0,0);
	oneTest(maze);
    }

    private static void oneTest (Maze maze){
	System.out.println(maze.row() + "*" + maze.column() + " maze");
    }
	
}
