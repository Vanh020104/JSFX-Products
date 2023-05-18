package demo1;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home2.fxml"));
        primaryStage.setScene(new Scene(root,850,650));
        primaryStage.setTitle("Doan Viet Anh");
        primaryStage.show();
    }
}

