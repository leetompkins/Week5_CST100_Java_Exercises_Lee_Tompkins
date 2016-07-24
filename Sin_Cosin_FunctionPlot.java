/** Program: Sin and Cosin Graph 
 *  Summary: Week 5 Exercise 14.19 
 *  Creates a graph and plots the sin and cosin graphs with JavaFX. The pi locations are labeled on the grpah, as well as the X and Y axis 
 *  File: Sin_Cosin_FunctionPlot.java 
 *  Author: Lee Tompkins 
 *  Date: July 24 2016  
 * 
 **/
import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
public class Sin_Cosin_FunctionPlot extends Application {
	@Override
	public void start(Stage primaryStage){
		// Create new pane 
	Pane pane = new Pane();
	
	
	// Create Texts, and x, y lines for graph
	Line lineX = new Line(10, 400, 790, 400);
	Line lineY = new Line(400, 10, 400, 790);
	Text textX = new Text(10, 400, "X");
	Text textY = new Text(400, 10, "Y");
	Text textPi = new Text(490, 410, "\u03C0");
	Text textPiTwo = new Text(580, 410, "2\u03C0");
	Text textPiNeg = new Text(310, 410, "-\u03C0");
	Text textPiNegTwo = new Text(220, 410, "-2\u03C0");
	
	// Loop through degrees -360 to 360, and set to radians
	// Add points to polylines 
	Polyline polySin = new Polyline();
	Polyline polyCoSin = new Polyline();
	for (double angle = -720; angle <= 720; angle++){
		polySin.getPoints().addAll(angle, Math.sin(Math.toRadians(angle)));
		polyCoSin.getPoints().addAll(angle, Math.cos(Math.toRadians(angle)));
	}
	// Set polylines to correct position on screen
	polySin.setTranslateY(400);
	polyCoSin.setTranslateY(400);
	polySin.setTranslateX(490);
	polyCoSin.setTranslateX(490);
	polySin.setScaleX(.5);
	polyCoSin.setScaleX(.5);
	polySin.setScaleY(50);
	polyCoSin.setScaleY(50);
	polySin.setStrokeWidth(.01);
	polyCoSin.setStrokeWidth(.01);
	polySin.setStroke(Color.RED);
	polyCoSin.setStroke(Color.BLUE);
	
	
	// Add all shapes, lines, and texts to pane
	pane.getChildren().addAll(lineX, lineY, textX, textY, polySin, polyCoSin, textPi, textPiNeg, textPiNegTwo, textPiTwo);
	
	
	
	
	
	//Create a scene and set it in the stage 
			primaryStage.setResizable(false); // dont allow scene resize
			Scene scene = new Scene(pane, 800, 800);
			primaryStage.setTitle("Sin & Cosine 14.19");
			primaryStage.setScene(scene);
			primaryStage.show(); // display the stage 

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Application.launch(args);

	}

}
