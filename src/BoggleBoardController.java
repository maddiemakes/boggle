import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class BoggleBoardController {

    Integer colIndex;
    Integer rowIndex;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    private void mouseEvent(ActionEvent e) {
        Node source = (Node)e.getSource();
        colIndex = GridPane.getColumnIndex(source);
        rowIndex = GridPane.getRowIndex(source);
//        if(colIndex == null)
//            colIndex = 0;
//        if(rowIndex == null)
//            rowIndex = 0;
    }

    @FXML
    void handleOnMouseClicked(MouseEvent event) {
//        mouseEvent(event);
        Node source = (Node)event.getSource();
        source.setStyle("-fx-background-color:rgba(255,0,0,1)");

    }

    //TODO
    //On mouse hover, check to see if this is a valid letter that you can click.
    //   If not, turn it red and don't allow clicking. Else turn green.
    //On mouse click, add the letter to the word
    //


    @FXML
    void initialize() {

    }

    @FXML
    private void handleClose(ActionEvent event) {
        System.exit(0);
    }
}
