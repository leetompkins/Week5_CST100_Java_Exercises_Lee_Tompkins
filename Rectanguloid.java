/* Program: Rectanguloid 
 * Summary: Exercise 14.14 
 * A program that displays a rectangular shape and resizes with the resizing of 
 * the window 
 * Author: Lee Tompkins 
 * Date: July 20 2016 
 * File: Rectanguloid.java
 * 
 */
// import JavaFx pertinent classes
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;


	
	public class Rectanguloid extends Application {
		@Override // Overwrite the start method in the Application class 
		public void start(Stage primaryStage){
			
			Pane pane = new Pane(); // Pane for storing Nodes 
			
			
			// Create TopRear Line 
			Line lineRearTop = new Line((200), (100), (450), (100));
			//Bind X and Y properties 
			lineRearTop.endXProperty().bind(pane.widthProperty().subtract(50));
			pane.getChildren().add(lineRearTop); // add line to pane
			
			//Create Rear bottom line 
			Line lineRearBottom = new Line((200), (500), (450), (500));
			//Bind X and Y properties 
			lineRearBottom.endXProperty().bind(pane.widthProperty().subtract(50));
			lineRearBottom.startYProperty().bind(pane.heightProperty().subtract(350));
			lineRearBottom.endYProperty().bind(pane.heightProperty().subtract(350));
			pane.getChildren().add(lineRearBottom); // add line to pane
			
			// Create rear left line 
			Line lineRearLeft = new Line(200, 100, 200, 500);
			//Bind X and Y properties 
			lineRearLeft.endYProperty().bind(pane.heightProperty().subtract(350));
			pane.getChildren().add(lineRearLeft); // add line to pane
			
			// Create rear right line 
			Line lineRearRight = new Line(10, 100, 10, 10);
			//Bind X and Y properties 
			lineRearRight.startXProperty().bind(pane.widthProperty().subtract(50));
			lineRearRight.endXProperty().bind(pane.widthProperty().subtract(50));
			lineRearRight.endYProperty().bind(pane.heightProperty().subtract(350));
			pane.getChildren().add(lineRearRight); // add line to pane
			
			// Create front top line 
			Line lineFrontTop = new Line(100, 200, 350, 200);
			//Bind X and Y properties 
			lineFrontTop.endXProperty().bind(lineRearTop.endXProperty().subtract(50));
			pane.getChildren().add(lineFrontTop); // add line to pane
			 
			// Create front bottom line 
			Line lineFrontBottom = new Line(100, 600, 350, 600);
			//Bind X and Y properties 
			lineFrontBottom.startYProperty().bind(pane.heightProperty().subtract(250));
			lineFrontBottom.endYProperty().bind(pane.heightProperty().subtract(250));
			lineFrontBottom.endXProperty().bind(pane.widthProperty().subtract(100));
			pane.getChildren().add(lineFrontBottom); // add line to pane
			
			// Create front left line 
			Line lineFrontLeft = new Line(100, 200, 100, 600);
			lineFrontLeft.endYProperty().bind(pane.heightProperty().subtract(250));
			pane.getChildren().add(lineFrontLeft); // add line to pane
			
			// Create front right line 
			Line lineFrontRight = new Line();
			//Bind X and Y properties 
			lineFrontRight.endXProperty().bind(pane.widthProperty().subtract(100));
			lineFrontRight.startXProperty().bind(pane.widthProperty().subtract(100));
			lineFrontRight.startYProperty().bind(lineFrontTop.endYProperty());
			lineFrontRight.endYProperty().bind(lineFrontBottom.endYProperty());
			pane.getChildren().add(lineFrontRight); // add line to pane
			
			//Create middle top left line 
			Line lineMiddleTopL = new Line(0, 0, 200, 100);
			//Bind X and Y Properties 
			lineMiddleTopL.startXProperty().bind(lineFrontLeft.startXProperty());
			lineMiddleTopL.startYProperty().bind(lineFrontLeft.startYProperty());
			pane.getChildren().add(lineMiddleTopL); // add line to pane
			
			// Create middle bottom left line
			Line lineMiddleBottomL = new Line();
			//Bind X and Y properties 
			lineMiddleBottomL.startXProperty().bind(lineFrontBottom.startXProperty());
			lineMiddleBottomL.startYProperty().bind(lineFrontBottom.startYProperty());
			lineMiddleBottomL.endXProperty().bind(lineRearBottom.startXProperty());
			lineMiddleBottomL.endYProperty().bind(lineRearBottom.startYProperty());
			pane.getChildren().add(lineMiddleBottomL); // add line to pane
			
			// Create middle top right line 
			Line lineMiddleTopR = new Line();
			// Bind X and Y properties 
			lineMiddleTopR.startXProperty().bind(lineFrontTop.endXProperty());
			lineMiddleTopR.endXProperty().bind(lineRearTop.endXProperty());
			lineMiddleTopR.startYProperty().bind(lineFrontTop.endYProperty());
			lineMiddleTopR.endYProperty().bind(lineRearTop.endYProperty());
			pane.getChildren().add(lineMiddleTopR); // add line to pane
			
			// Create middle bottom right line 
			Line lineMiddleBottomR = new Line();
			// Bind X and Y positions 
			lineMiddleBottomR.startXProperty().bind(lineFrontBottom.endXProperty());
			lineMiddleBottomR.endXProperty().bind(lineRearBottom.endXProperty());
			lineMiddleBottomR.startYProperty().bind(lineFrontBottom.endYProperty());
			lineMiddleBottomR.endYProperty().bind(lineRearBottom.endYProperty());
			pane.getChildren().add(lineMiddleBottomR); // add line to pane
			
			
					
			
			
			//Create a scene and set it in the stage 
			Scene scene = new Scene(pane, 800, 800);
			primaryStage.setTitle("Rectanguloid 14.14");
			primaryStage.setScene(scene);
			primaryStage.show(); // display the stage 
			
			
			
			
			
	}

	public static void main(String[] args) {
		Application.launch(args); // Not needed if ran from command line 

	}
	
}
