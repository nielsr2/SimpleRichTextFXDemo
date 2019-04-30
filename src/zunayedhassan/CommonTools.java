package zunayedhassan;

import java.io.InputStream;
import java.util.Random;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Zunayed Hassan
 */
public class CommonTools extends Control {
    public static Stage PRIMARY_STAGE = null;


    public void SetStyleSheet(Scene scene, String styleClass) {
        scene.getStylesheets().add(this.getClass().getResource(styleClass).toExternalForm());
    }

    public Font GetFontFromFile(String fontName, int size) {
        InputStream fontInputStream = this.getClass().getResourceAsStream(fontName);
        Font font = Font.loadFont(fontInputStream, size);

        return font;
    }

    public void LoadIcon(Stage stage, String icon) {
        stage.getIcons().add(new Image(this.getClass().getResourceAsStream(icon)));
    }

//    KBSManager kbsManager = new KBSManager();
    public static Scene GET_SCENE_AND_INITIALIZE(Stage stage) {
        PRIMARY_STAGE = stage;

        Scene scene = null;

        //****************************************************
        OurGroup groupRoot = new OurGroup();
        //****************************************************


        if (Settings.IS_SCENE_TRANSPARENT) {
            scene = new Scene(groupRoot, Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT, Color.TRANSPARENT);
        }
        else {
            scene = new Scene(groupRoot, Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);
        }

        // setting up UI overlay
        //****************************************************
        BaseUI root = new RootUI();
//        KBSManager km = root.getChildren();
//        root.setPrefSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);
        //root.setStyle("-fx-border-color: red");


        //****************************************************

        CommonTools tools = new CommonTools();

        for (String[] fontInformation : Settings.FONTS) {
            tools.GetFontFromFile(fontInformation[0], Integer.parseInt(fontInformation[1].trim()));
        }

        if (Settings.APPLICATION_ICON != null) {
            tools.LoadIcon(PRIMARY_STAGE, Settings.APPLICATION_ICON);
        }

        root.InitializeStyleSheets(scene, Settings.STYLE_CLASSES);
        stage.setTitle(Settings.WINDOW_TITLE);

        return scene;
    }
    
    public static Background GET_BACKGROUND(Color color) {
        return new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY));
    }
    
    public static Color GET_RANDOM_COLOR() {
        Random random = new Random();
        
        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);
        
        Color randomColor = Color.rgb(red, green, blue);
        
        return randomColor;
    }
    
    public static Background GET_RANDOM_BACKGROUND() {
        return GET_BACKGROUND(GET_RANDOM_COLOR());
    }
}
