package zunayedhassan;

import javafx.geometry.Insets;
import javafx.scene.Group;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class KBS extends Group {
    private String oprSystem;
    private boolean visible = false;
    private int kbsTimesUsed = 0;
    private int tbTimesClicked = 0;
    private int nrOnList;
    private boolean pinned;
    public int KBStype[] = new int[5];
    KBS(){

    }

    KBS(String oprSystem){
        this.oprSystem = oprSystem;
    }

    public Group displayKBS(){
        Group group = new Group();

        Rectangle backgroundRect = new Rectangle(170,50, Color.LIGHTGREY);

        HBox content = new HBox(5);
        content.setPadding(new Insets(5,5,5,5));

        ImageView imageView = new ImageView(new Image("zunayedhassan/SimpleRichTextFX/icons/oldIcons/edit-cut.png"));
        imageView.setFitWidth(40);
        imageView.setPreserveRatio(true);
        imageView.setSmooth(true);
        imageView.setCache(true);

        Text shortcut = new Text("Ctrl + X");
        shortcut.setFont(new Font(33));

        content.getChildren().addAll(imageView, shortcut);


        group.getChildren().addAll(backgroundRect, content);
       return group;

    }







}
