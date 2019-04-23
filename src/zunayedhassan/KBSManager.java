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
        String path = "M 100 100 L 300 100 L 200 200 L 0 200 z";
        SVGPath svgpath = new SVGPath();
        svgpath.setContent(path);
        return svgpath;
    }
    private void _initializeEvents() {
        this.OUR.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Hi there! You clicked me!");
                OUR.setFill(Color.RED);
            }
        });
    }
}
