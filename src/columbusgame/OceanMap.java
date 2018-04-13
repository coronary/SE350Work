package SE350.src.columbusgame;

import java.util.Arrays;

public class OceanMap {

	
	private static boolean [][] makeGrid(){
		 boolean grid [][] = new boolean[10][10];
		 for (boolean[] row: grid)
			    Arrays.fill(row,  false);
		 return grid;
	}
	
	public static boolean[][] getMap(){
		return makeGrid();
	}

}
