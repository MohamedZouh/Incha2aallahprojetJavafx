package Application1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	
	
	
public static void main(String[] args) {
	launch(args);
}



@Override
public void start(Stage primaryStage) throws Exception {
	// TODO Auto-generated method stub
	Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("PlatformeSignUp.fxml"));
	Scene scene =new Scene(root,400,400);
	primaryStage.setScene(scene);
	primaryStage.setResizable(false);
	primaryStage.show();
}
}