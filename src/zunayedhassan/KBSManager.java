package zunayedhassan;

import javafx.geometry.Insets;
import javafx.scene.layout.FlowPane;

import static javafx.geometry.Pos.BOTTOM_RIGHT;

//import javafx.scene.paint.Paint;

// import com.fx.javafx.util;

public class KBSManager extends FlowPane {

    //    SVGPath OUR = this._init();
    KBS[] kbsArray = new KBS[20];
    KBSManager(){

        for (int i = 0; i < kbsArray.length; i++) {

        }
        kbsArray[0] = new KBS("Ctrl + X", "zunayedhassan/SimpleRichTextFX/icons/newIconsPNG/CutIconHR.png");
        kbsArray[1] = new KBS("Ctrl + 2", "zunayedhassan/SimpleRichTextFX/icons/newIconsPNG/BiconHR.png");
//        this._init();
//        this._initializeEvents();
        // this.OUR.stroke(new Paint());
        // this.setOrientation(VERTICAL);
        this.setPadding(new Insets(5, 5, 5, 5));
        this.setVgap(5);
        this.setStyle("-fx-border-color: black");
        this.setAlignment(BOTTOM_RIGHT);
        //kbsPane.setStyle("-fx-border-color: red");
        //String path = "M 100 100 L 300 100 L 200 200 L 0 200 z";
        //SVGPath svgpath = new SVGPath();
        //svgpath.setContent(path);

//        this.getChildren().addAll(kbs.displayKBS());
        this.getChildren().addAll(kbsArray[0],kbsArray[1]);

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
//void setupToolbarListeners(){
//
//    parent.boldToggleButton.setOnAction(new EventHandler<ActionEvent>() {
//        @Override
//        public void handle(ActionEvent event) {
//            int bold = 0;
//            KBSArray[bold].KBSused();
//        }
//    });
//
//    this.italicToggleButton.setOnAction(new EventHandler<ActionEvent>() {
//        @Override
//        public void handle(ActionEvent event) {
//            int italic = 1;
//            KBSArray[italic].KBSused();
//        }
//    });
//
//    this.underlineToggleButton.setOnAction(new EventHandler<ActionEvent>() {
//        @Override
//        public void handle(ActionEvent event) {
//            int underline = 2;
//            KBSArray[underline].KBSused();
//        }
//    });
//
//    this.strikethroughToggleButton.setOnAction(new EventHandler<ActionEvent>() {
//        @Override
//        public void handle(ActionEvent event) {
//            int strikethrough = 3;
//            KBSArray[strikethrough].KBSused();
//        }
//    });
//
//}
}
