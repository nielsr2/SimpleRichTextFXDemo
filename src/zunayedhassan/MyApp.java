/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zunayedhassan;

        import javafx.application.Application;
        import javafx.event.EventHandler;
        import javafx.scene.Node;
        import javafx.scene.input.*;
        import javafx.stage.Stage;

/**
 *
 * @author Zunayed Hassan
 */
public class MyApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setScene(CommonTools.GET_SCENE_AND_INITIALIZE(primaryStage));
        primaryStage.show();
        Node JL = primaryStage.getScene().lookup("#justLeft");
        Node JR = primaryStage.getScene().lookup("#justRight");
        Node JC = primaryStage.getScene().lookup("#justCenter");
        Node BO = primaryStage.getScene().lookup("#bold");
        KeyCombination justifyLeftKC = new KeyCodeCombination(KeyCode.J, KeyCombination.SHORTCUT_DOWN);
        KeyCombination justifyCenterKC = new KeyCodeCombination(KeyCode.K, KeyCombination.SHORTCUT_DOWN);
        KeyCombination justifyRightKC = new KeyCodeCombination(KeyCode.L, KeyCombination.SHORTCUT_DOWN);
        KeyCombination boldKC = new KeyCodeCombination(KeyCode.B, KeyCombination.SHORTCUT_DOWN);
        Mnemonic mn = new Mnemonic(JL, justifyLeftKC);
        Mnemonic mn2 = new Mnemonic(JR, justifyCenterKC);
        Mnemonic mn3 = new Mnemonic(JC, justifyRightKC);
        Mnemonic mn4 = new Mnemonic(BO, boldKC);
        primaryStage.getScene().addMnemonic(mn);
        primaryStage.getScene().addMnemonic(mn2);
        primaryStage.getScene().addMnemonic(mn3);
        primaryStage.getScene().addMnemonic(mn4);
//        primaryStage.getScene().addMnemonic(mn);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
