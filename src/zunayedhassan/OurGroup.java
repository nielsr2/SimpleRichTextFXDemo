package zunayedhassan;

import javafx.scene.Group;
import javafx.scene.layout.BorderPane;

public class OurGroup extends Group {
    BaseUI root = new RootUI();
    KBSManager km = new KBSManager();
    BorderPane overlayPane = new BorderPane();
    OurGroup(){
        root.setPrefSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);
        overlayPane.setPrefSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);
        //overlayPane.setStyle("-fx-border-color: red");
        this.getChildren().addAll(overlayPane,root);
        overlayPane.setRight(km);

    }
}
