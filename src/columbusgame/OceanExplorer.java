package SE350.src.columbusgame;

import java.awt.Point;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class OceanExplorer extends Application {
	final int dimension = 10;
	final int scale = 50;
	Scene scene;
	AnchorPane root;
	Ship pirate = new Ship();
	ImageView shipImageView;
	
	public static void main(String[] args){
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		root = new AnchorPane();
		scene = new Scene(root,500,500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Columbus");
		primaryStage.show();
		drawMap();
		loadImages();
		startSailing();
	
	}
	public void drawMap(){
		boolean[][] oceanGrid = OceanMap.getMap();
		for (int x=0; x< dimension;x++){
			for(int y=0;y<dimension;y++){
			Rectangle rect = new Rectangle(x*scale,y*scale,scale,scale);
			rect.setStroke(Color.BLACK);
			rect.setFill(Color.PALETURQUOISE);
			root.getChildren().add(rect);	
			}
		}
		
		
	}
	public void loadImages(){
		Image shipImage = new Image("ship.png",50,50,false,false);
		shipImageView = new ImageView(shipImage);
		shipImageView.setX(pirate.getShipLocation().getX()*scale);
		shipImageView.setY(pirate.getShipLocation().getY()*scale);
		root.getChildren().add(shipImageView);
	}
	
	private void startSailing(){
		scene.setOnKeyPressed(new EventHandler<KeyEvent>(){
			@Override
			public void handle(KeyEvent ke){
				switch(ke.getCode()){
				case RIGHT:
					pirate.goEast();
					break;
				case LEFT:
					pirate.goWest();
					break;
				case UP:
					pirate.goNorth();
					break;
				case DOWN:
					pirate.goSouth();
					break;
				default:
					break;
				}
			shipImageView.setX(pirate.getShipLocation().getX()*scale);
			shipImageView.setY(pirate.getShipLocation().getY()*scale);
			}
		});
		
		
	}

}
