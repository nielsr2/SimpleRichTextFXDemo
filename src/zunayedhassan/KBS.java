package zunayedhassan;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
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
import javafx.util.Duration;

public class KBS {
    private String oprSystem;
    private boolean visible = false;
    protected int kbsTimesUsed = 0;
    protected int tbTimesClicked = 0;
    private int nrOnList;
    private boolean pinned;
    public int KBStype[] = new int[5];

    private double opacity = 1;

    KBS() {


        /** colors for the gradient */
        // http://www.java2s.com/Tutorials/Java/JavaFX/0110__JavaFX_Gradient_Color.htm

        Color grColorGrey1 = new Color(0.5, 0.5, 0.5, 0.30);
        Color grColorGrey2 = new Color(0.7, 0.7, 0.7, 0.15);

        Color grColorRed1 = new Color(0.5, 0, 0, 0.70);
        Color grColorRed2 = new Color(0.5, 0, 0, 0.30);

        Color grColorYellow1 = new Color(0.9, 0.7, 0, 0.70);
        Color grColorYellow2 = new Color(0.9, 0.7, 0, 0.30);

        Color grColorGreen1 = new Color(0.2, 0.6, 0, 0.70);
        Color grColorGreen2 = new Color(0.2, 0.6, 0, 0.30);

    }

    KBS(String oprSystem){
        this.oprSystem = oprSystem;
    }

    public  void KBSused() {
        this.kbsTimesUsed++;
        this.tbTimesClicked++;
        System.out.println(this.kbsTimesUsed + " " + this.tbTimesClicked);
    }

    //  public Rectangle displayKBS(){
    //  return new Rectangle(100,100,100,50);
    // }

    /** methods for each gradient color gradient */

    public void colorGrey(Color grColorGrey1, Color grColorGrey2) {
        Stop[] stopsGrey = new Stop[] { new Stop(0, grColorGrey1), new Stop(1, grColorGrey2)};
        LinearGradient lgGrey = new LinearGradient(1, 0, 0, 0, true, CycleMethod.NO_CYCLE, stopsGrey);

        Rectangle backgroundRectGrey = new Rectangle(170,50);
        backgroundRectGrey.setFill(lgGrey);
    }

    public void colorRed(Color grColorRed1, Color grColorRed2){
        Stop[] stopsRed = new Stop[] { new Stop(0, grColorRed1), new Stop(1, grColorRed2)};
        LinearGradient lgRed = new LinearGradient(1, 0, 0, 0, true, CycleMethod.NO_CYCLE, stopsRed);

        Rectangle backgroundRectRed = new Rectangle(170,50);
        backgroundRectRed.setFill(lgRed);
    }

    public void colorYellow(Color grColorYellow1, Color grColorYellow2){
        Stop[] stopsYellow = new Stop[] { new Stop(0, grColorYellow1), new Stop(1, grColorYellow2)};
        LinearGradient lgYellow = new LinearGradient(1, 0, 0, 0, true, CycleMethod.NO_CYCLE, stopsYellow);

        Rectangle backgroundRectYellow = new Rectangle(170,50);
        backgroundRectYellow.setFill(lgYellow);
    }

    public void colorGreen(Color grColorGreen1, Color grColorGreen2){
        Stop[] stopsGreen = new Stop[] { new Stop(0, grColorGreen1), new Stop(1, grColorGreen2)};
        LinearGradient lgGreen = new LinearGradient(1, 0, 0, 0, true, CycleMethod.NO_CYCLE, stopsGreen);

        Rectangle backgroundRectGreen = new Rectangle(170,50);
        backgroundRectGreen.setFill(lgGreen);
    }


    public Group displayKBS(){
        Group group = new Group();

        // initial rectangle
        Rectangle backgroundRect = new Rectangle(170, 50, Color.LIGHTGREY);

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
        // group.getChildren().addAll(backgroundRectRed, content);
        // group.getChildren().addAll(backgroundRectYellow, content);
        // group.getChildren().addAll(backgroundRectGreen, content);

        return group;
    }

    public void fade(double opacityEnd, double time) {

        double opacityStart = this.opacity;

        Rectangle rect = new Rectangle(100, 100, Color.BLACK);

        FadeTransition fade = new FadeTransition(Duration.millis(time), rect);
        fade.setFromValue(opacityStart);
        fade.setToValue(opacityEnd);
        fade.setCycleCount(Timeline.INDEFINITE);
        fade.setAutoReverse(true);
        fade.play(); //start animation

        //this.setOnMousePressed(e -> System.out.println("adasfdf"));


    }







}
