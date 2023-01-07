package application;
import java.sql.*;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		// This is a demo or connecting a java program to a database
		//we will see how to open database connection...
		
		try
		{
			Connection con = null;
			//Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/satishlesson","root","Yoonja7979!!");
			System.out.println("Connection is successful.");
			con.close();
			
			
		}
		catch(SQLException e)
		{
		System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		/*
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("JavaDemoTwo.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		*/
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
