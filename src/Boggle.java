import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class Boggle extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    static Scene scene;

    @Override
    public void start(Stage primary) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("boggleBoard.fxml"));
        scene = new Scene(root);
        primary.setScene(scene);
        primary.setTitle("Boggle");
        primary.show();
    }
}