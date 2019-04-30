package zunayedhassan;

import javafx.beans.property.ObjectProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
//import javafx.scene.paint.Paint;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import com.fxexperience.javafx.animation.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import static javafx.geometry.Pos.*;

// import com.fx.javafx.util;

public class KBSManager extends FlowPane {

    //    SVGPath OUR = this._init();
    KBS[] KBS = new KBS[20];
    KBSManager(){
//        this._init();
//        this._initializeEvents();
        // this.OUR.stroke(new Paint());
        this.setOrientation(VERTICAL);
        this.setPadding(new Insets(5, 5, 5, 5));
        this.setVgap(5);
        this.setStyle("-fx-border-color: black");
        this.setAlignment(BOTTOM_RIGHT);
        //kbsPane.setStyle("-fx-border-color: red");
        String path = "M 100 100 L 300 100 L 200 200 L 0 200 z";
        SVGPath svgpath = new SVGPath();
        svgpath.setContent(path);

//        this.getChildren().addAll(kbs.displayKBS());
        this.getChildren().addAll(svgpath);
    }
//    private SVGPath _init() {
////        String path = "M 100 100 L 300 100 L 200 200 L 0 200 z";
//        // bulb shape
//        String path = "M224.68,57c-61.16,0-110.8,51.2-110.87,112.36a112.06,112.06,0,0,0,27,73.2,100.45,100.45,0,0,1,21.6,44.64c9.93,47,40.68,58.23,62.29,58.23h0c21.62,0,52.37-11.25,62.29-58.23a100.45,100.45,0,0,1,21.6-44.64,112.06,112.06,0,0,0,27-73.2C335.48,108.2,281,57,224.68,57Z";
//        SVGPath svgpath = new SVGPath();
//        svgpath.setContent(path);
//        svgpath.setStrokeWidth(2);
//        svgpath.setStroke(Color.BLACK);
//        return svgpath;
//    }
//
//
//    private void _initializeEvents() {
//        this.OUR.setOnMousePressed(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                System.out.println( "Hi there! You clicked me!");
//                OUR.setFill(Color.RED);
//                FadeInDownBigTransition Anim = new FadeInDownBigTransition(OUR);
//                Anim.setOnFinished(new EventHandler<ActionEvent>() {
//                    @Override
//                    public void handle(ActionEvent event) {
//                        new TadaTransition(OUR).play();
//                    }
//                });
//                Anim.play();
//
//
//            }
//        });
//    }

}
