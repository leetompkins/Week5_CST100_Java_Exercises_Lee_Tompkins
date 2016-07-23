/* Program: Display Hangman 
* Summary: Week5 Exercise 14.17
* Displays a Hangman for the hangman game using polylines, circles, and lines 
* Author: Lee Tompkins 
* Date: July 22 2016 
* File: HangmanGame.java
*/

import javafx.scene.paint.Color;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;


public class HangmanGame extends Application {
	@Override // Overwrite the start method in the Application class 
	public void start(Stage primaryStage){
		Pane pane = new Pane();
		

		// Create the Hangman Stand with a PolyLine 
		Polyline hangManStand = new Polyline();
		ObservableList<Double> listStand = hangManStand.getPoints();
		listStand.add(100.00);
		listStand.add(600.00);
		listStand.add(100.00);
		listStand.add(100.00);
		listStand.add(300.00);
		listStand.add(100.00);
		listStand.add(300.00);
		listStand.add(150.00);
		pane.getChildren().add(hangManStand);
		
		// Create the Hangman Stand base 
		Arc standBase = new Arc(100, 700, 100, 100, 45, 90);
		standBase.setType(ArcType.CHORD);
		standBase.setFill(null);
		standBase.setStroke(Color.BLACK);
		pane.getChildren().add(standBase);
		
		//Create Hangman head
		Circle head = new Circle(300, 200, 50);
		head.setFill(null);
		head.setStroke(Color.BLACK);
		pane.getChildren().add(head);
		
		//Create Hangman Torso 
		Line torso = new Line(300, 250, 300, 400);
		pane.getChildren().add(torso);
		
		//Create Arms
		Polyline arms = new Polyline();
		ObservableList<Double> listArms = arms.getPoints();
		listArms.add(200.00);
		listArms.add(300.00);
		listArms.add(300.00);
		listArms.add(250.00);
		listArms.add(400.00);
		listArms.add(300.00);
		pane.getChildren().add(arms);
		
		//Create Legs 
		//Create Arms
		Polyline legs = new Polyline();
		ObservableList<Double> listLegs = legs.getPoints();
		listLegs.add(250.00);
		listLegs.add(500.00);
		listLegs.add(300.00);
		listLegs.add(400.00);
		listLegs.add(350.00);
		listLegs.add(500.00);
		pane.getChildren().add(legs);
		
		
		
		//Create a scene and set it in the stage 
		primaryStage.setResizable(false);
		Scene scene = new Scene(pane, 1280, 720);
		primaryStage.setTitle("Hangman Game 14.17");
		primaryStage.setScene(scene);
		primaryStage.show(); // display the stage 
	}

	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}

