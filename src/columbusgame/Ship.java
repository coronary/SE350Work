package SE350.src.columbusgame;

import java.awt.Point;
import java.util.Random;


public class Ship {
	final int dimension = 10;
	Random rand = new Random();
	static int shipX;
	static int shipY;
	
	public Ship(){
		shipX = rand.nextInt(dimension);
		shipY = rand.nextInt(dimension);
	}
	public Point getShipLocation(){
		Point currentLocation = new Point(shipX, shipY);
		return currentLocation;
	}
	
	public void goEast(){
		if (shipX == 9){
			
		}else{
			shipX = shipX + 1;
		}
	}
	
	public void goWest(){
		if (shipX == 0){
			
		}else{
			shipX = shipX - 1;
		}
	}
	
	public void goNorth(){
		if (shipY == 0){
			
		}else{
			shipY = shipY - 1;	
		}
	}
	
	public void goSouth(){
		if (shipY == 9){
			
		}else{
			shipY = shipY + 1;
		}
	}

}
