package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){
        try {
            Pane root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
            Scene scene = new Scene(root, 850, 550);
            root.prefHeightProperty().bind(scene.heightProperty());
            root.prefWidthProperty().bind(scene.widthProperty());

            //primaryStage.setTitle("Online Shop");
            primaryStage.initStyle(StageStyle.TRANSPARENT);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (Exception e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
            e.printStackTrace();
            System.out.println("Error in Launcher");
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
