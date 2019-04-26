package zunayedhassan;

import javafx.geometry.Insets;
import javafx.scene.Group;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
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

        // http://www.java2s.com/Tutorials/Java/JavaFX/0110__JavaFX_Gradient_Color.htm
       // Rectangle backgroundRect = new Rectangle(170,50, Color.LIGHTGREY);
        Color grColor1 = new Color(0.5, 0.5, 0.5, 0.30);
        Color grColor2 = new Color(0.7, 0.7, 0.7, 0.15);

        Stop[] stops = new Stop[] { new Stop(0, grColor1), new Stop(1, grColor2)};
        LinearGradient lg1 = new LinearGradient(1, 0, 0, 0, true, CycleMethod.NO_CYCLE, stops);
        Rectangle backgroundRect = new Rectangle(170,50);
        backgroundRect.setFill(lg1);


        HBox content = new HBox(5);
        content.setPadding(new Insets(5,5,5,5));

        ImageView imageView = new ImageView(new Image("zunayedhassan/SimpleRichTextFX/icons/newIconsPNG/CutIconHR.png"));
        imageView.setFitWidth(40);
        imageView.setPreserveRatio(true);
        imageView.setSmooth(true);
        imageView.setCache(true);

        Text shortcut = new Text("Ctrl + X");
        shortcut.setFont(new Font(30));

        content.getChildren().addAll(imageView, shortcut);

        group.getChildren().addAll(backgroundRect, content);
       return group;

    }
}
