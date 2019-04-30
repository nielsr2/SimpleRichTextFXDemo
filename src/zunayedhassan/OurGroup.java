package zunayedhassan;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;

public class OurGroup extends Group {
    BaseUI root = new RootUI();
    KBSManager km = new KBSManager();
//    Group overlayPane = new Group();
    BorderPane overlayPane = new BorderPane();
    OurGroup(){
        root.setPrefSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);
        overlayPane.setPrefSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);
        //overlayPane.setStyle("-fx-border-color: red");
        this.getChildren().addAll(overlayPane,root);
//        this.getChildren().addAll(root);
//        overlayPane.toFront();
        overlayPane.setRight(km);

    }
}
