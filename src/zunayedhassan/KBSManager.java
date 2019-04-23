package zunayedhassan;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;

public class KBSManager {
    SVGPath OUR = this._init();
    KBSManager(){
        this._init();
        this._initializeEvents();
    }
    private SVGPath _init() {
//        String path = "M 100 100 L 300 100 L 200 200 L 0 200 z";
        String path = "M224.68,57c-61.16,0-110.8,51.2-110.87,112.36a112.06,112.06,0,0,0,27,73.2,100.45,100.45,0,0,1,21.6,44.64c9.93,47,40.68,58.23,62.29,58.23h0c21.62,0,52.37-11.25,62.29-58.23a100.45,100.45,0,0,1,21.6-44.64,112.06,112.06,0,0,0,27-73.2C335.48,108.2,281,57,224.68,57Z";
        SVGPath svgpath = new SVGPath();
        svgpath.setContent(path);
        return svgpath;
    }
    private void _initializeEvents() {
        this.OUR.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println( "Hi there! You clicked me!");
                OUR.setFill(Color.RED);
            }
        });
    }
}