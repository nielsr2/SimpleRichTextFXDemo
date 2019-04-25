package zunayedhassan;

import javafx.beans.property.ObjectProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
//import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import com.fxexperience.javafx.animation.*;

import static javafx.geometry.Pos.*;

// import com.fx.javafx.util;

public class KBSManager {
    SVGPath OUR = this._init();
    KBS rectTest1 = new KBS();
    KBS rectTest2 = new KBS();


    KBSManager(){
        this._init();
        this._initializeEvents();
        // this.OUR.stroke(new Paint());
    }
    private SVGPath _init() {
//        String path = "M 100 100 L 300 100 L 200 200 L 0 200 z";
        // bulb shape
        String path = "M224.68,57c-61.16,0-110.8,51.2-110.87,112.36a112.06,112.06,0,0,0,27,73.2,100.45,100.45,0,0,1,21.6,44.64c9.93,47,40.68,58.23,62.29,58.23h0c21.62,0,52.37-11.25,62.29-58.23a100.45,100.45,0,0,1,21.6-44.64,112.06,112.06,0,0,0,27-73.2C335.48,108.2,281,57,224.68,57Z";
        SVGPath svgpath = new SVGPath();
        svgpath.setContent(path);
        svgpath.setStrokeWidth(2);
        svgpath.setStroke(Color.BLACK);
        return svgpath;
    }


    private void _initializeEvents() {
        this.OUR.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println( "Hi there! You clicked me!");
                OUR.setFill(Color.RED);
                FadeInDownBigTransition Anim = new FadeInDownBigTransition(OUR);
                Anim.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        new TadaTransition(OUR).play();
                    }
                });
                Anim.play();


            }
        });
    }
    public FlowPane initializeKBS(){
        FlowPane kbsPane = new FlowPane(Orientation.VERTICAL);
        kbsPane.setPadding(new Insets( 5,5,5,5));
        kbsPane.setVgap(5);
        kbsPane.setAlignment(BOTTOM_RIGHT);



  //      rect1.displayKBS();

        Rectangle rectangle1 = new Rectangle(100,100,Color.RED);
        Rectangle rectangle2 = new Rectangle(100,100,Color.RED);
        kbsPane.getChildren().addAll (rectangle1, rectangle2);


        return kbsPane;

    }

}
