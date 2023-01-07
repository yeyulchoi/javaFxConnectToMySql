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
		
		//**** This is a demo for delete operation on mySql using JDBC ***
		
		//we will see how to open database connection...
		
		try
		{
			Connection conn;
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/satishlesson","root","Yoonja7979!!");
			System.out.println("database has been connected");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("delete from student where name='yeyul'");
			System.out.println("deletion has been completed.");
			stmt.close();
			conn.close();
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
