/* Program: Bar Chart
 * Summary: Week5 Exercise 14.12
 * A program that displays an interface using rectangle shapes as bars for graphing percents of grade work (ie Quizes are worth 10% of the total grad) 
 * Bars are separated by space, and color, as well as size with respect to their percentage of the final grade 
 * Author: Lee Tompkins 
 * Date: July 20 2016
 * File: BarChart.java
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.control.*;

public class BarChart extends Application {
	@Override // Overwrite the start method in the Application class 
	public void start(Stage primaryStage){
		
		// create pane to hold rectangle bars & labels
		Pane pane = new Pane();
		
		double baseY = 390; // Integer for creating common base along y axis
		
		// Create Rectangles for (project bar) and set properties p570
		Rectangle rectangleProject = new Rectangle(75, 40);
		rectangleProject.setFill(new Color(1, 0, 0, 1)); // R,G,B,Opacity 
		rectangleProject.setX(50);
		rectangleProject.setY(baseY - 40); 
		pane.getChildren().add(rectangleProject); //add project rectangle to pane
		
		//Create label for project bar 
		Label projectLabel = new Label("Project -- 20%");
		projectLabel.setLayoutX(rectangleProject.getX());
		projectLabel.setLayoutY(rectangleProject.getY() - 20);
		pane.getChildren().add(projectLabel);
		
		// Create Rectangle for (Quiz bar) and set properties 
		Rectangle rectangleQuiz = new Rectangle(75, 20);
		rectangleQuiz.setX(145);
		rectangleQuiz.setY(baseY - 20);
		rectangleQuiz.setFill(new Color(0, 0, 1, 1)); // R,G,B,Opacity 
		pane.getChildren().add(rectangleQuiz);
		
		//Create label for Quiz bar 
		Label quizLabel = new Label("Quiz -- 10%");
		quizLabel.setLayoutX(rectangleQuiz.getX());
		quizLabel.setLayoutY(rectangleQuiz.getY() - 20);
		pane.getChildren().add(quizLabel);
		
		// Create Rectangle for ( Midterm Bar) and set properties
		Rectangle rectangleMidterm = new Rectangle(75, 60);
		rectangleMidterm.setX(145 + 95);
		rectangleMidterm.setY(baseY - 60);
		rectangleMidterm.setFill(new Color(0, 1, 0 ,1));
		pane.getChildren().add(rectangleMidterm);
		
		//Create label for Midterm bar 
		Label midtermLabel = new Label("Midterm -- 30%");
		midtermLabel.setLayoutX(rectangleMidterm.getX());
		midtermLabel.setLayoutY(rectangleMidterm.getY() - 20);
		pane.getChildren().add(midtermLabel);
		
		//Create rectangle for (Final bar) and set properties
		Rectangle rectangleFinal = new Rectangle(75, 80);
		rectangleFinal.setX(145 + 95 + 95);
		rectangleFinal.setY(baseY - 80);
		rectangleFinal.setFill(new Color(1, .5, 0, 1));
		pane.getChildren().add(rectangleFinal);
		
		//Create label for Final bar 
		Label finalLabel = new Label("Final -- 40%");
		finalLabel.setLayoutX(rectangleFinal.getX());
		finalLabel.setLayoutY(rectangleFinal.getY() - 20);
		pane.getChildren().add(finalLabel);
		
		
		//Create a scene and set it in the stage 
		Scene scene = new Scene(pane, 500, 400);
		primaryStage.setTitle("Bar Chart Exercise 14.12");
		primaryStage.setScene(scene);
		primaryStage.show(); // display the stage 
	}
		
		public static void main(String[] args) { // not needed if run from console 
			Application.launch(args);
		}
}
