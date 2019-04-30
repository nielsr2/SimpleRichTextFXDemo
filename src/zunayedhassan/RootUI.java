/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zunayedhassan;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import zunayedhassan.SimpleRichTextFX.RichText;

import java.util.List;

/**
 * @author Zunayed Hassan
 */
public class RootUI extends BaseUI {
    public ToolBar RichTextToolBar = new ToolBar();
    public RichText RichTextControl = new RichText();

    protected ScrollPane scrollPane = null;
    protected ComboBox<String> fontsCombobox = this._getFontsCombobox();
    protected ComboBox<String> fontSizeComboBox = this._getFontSizeComboBox();
    protected ToggleButton boldToggleButton = this._getIconToggleButton("SimpleRichTextFX/icons/newIconsPNG/Bicon.png", "bold"); //***************** P2
    protected ToggleButton italicToggleButton = this._getIconToggleButton("SimpleRichTextFX/icons/newIconsPNG/Iicon.png", "italic"); //***************** P2
    protected ToggleButton underlineToggleButton = this._getIconToggleButton("SimpleRichTextFX/icons/newIconsPNG/Uicon.png", "underline"); //***************** P2
    protected ToggleButton strikethroughToggleButton = this._getIconToggleButton("SimpleRichTextFX/icons/newIconsPNG/Sicon.png", "strikethrough"); //***************** P2
    protected Button leftJustfyToggleButton = this._getIconButton("SimpleRichTextFX/icons/newIconsPNG/ALicon.png", "justLeft"); //***************** P2
    protected Button centerJustfyToggleButton = this._getIconButton("SimpleRichTextFX/icons/newIconsPNG/ACicon.png", "justCenter"); //***************** P2
    protected Button rightJustfyToggleButton = this._getIconButton("SimpleRichTextFX/icons/newIconsPNG/ARicon.png", "justRight"); //***************** P2
    protected ColorPicker fontColorPicker = new ColorPicker(Color.BLACK);
    protected ToggleButton spellCheckToggleButton = this._getIconToggleButton("SimpleRichTextFX/icons/newIconsPNG/SCicon.png", "spellcheck"); //***************** P2


    public RootUI() {
        this._initializeLayout();
        this._initializeEvents();
    }


    private ComboBox<String> _getFontsCombobox() {
        ComboBox<String> fontsCombobox = new ComboBox<>();
        List<String> fontsList = Font.getFamilies();
        fontsCombobox.getItems().addAll(fontsList);

        int defaultFontIndex = fontsList.indexOf("Times New Roman"); //************************* P2 changes
        fontsCombobox.getSelectionModel().select(defaultFontIndex);

        return fontsCombobox;
    }

    private ComboBox<String> _getFontSizeComboBox() {
        ComboBox<String> fontSize = new ComboBox<>();

        fontSize.getItems().addAll(
                "8", "10", "12", "14", "16", "18", "20", "22", "24", "36", "48", "72"
        );

        fontSize.getSelectionModel().select(2);

        return fontSize;
    }

    private ToggleButton _getIconToggleButton(String icon, String id) { // added id param
        ToggleButton toggleButton = new ToggleButton();
        toggleButton.setId(id); // ******************************************** P2
        toggleButton.setGraphic(new ImageView(new Image(this.getClass().getResourceAsStream(icon))));

        return toggleButton;
    }

    //*********************************************************************************************************************************************************************** P2
//    private ToggleButton _getIconToggleButton(String icon, String name) {
//        ToggleButton toggleButton = new ToggleButton(name);
//        toggleButton.setGraphic(new ImageView(new Image(this.getClass().getResourceAsStream(icon))));
//
//        return toggleButton;
//    }
    //*********************************************************************************************************************************************************************** P2
    private Button _getIconButton(String icon, String id) { //******************************************** added String for ID
        Button button = new Button();
        button.setId(id); // ******************************************** P2
        button.setGraphic(new ImageView(new Image(this.getClass().getResourceAsStream(icon))));

        return button;
    }

    private void _initializeLayout() {
        this.RichTextToolBar.getItems().addAll(
                this.fontsCombobox,
                this.fontSizeComboBox,
                new Separator(),
                this.boldToggleButton,
                this.italicToggleButton,
                this.underlineToggleButton,
                this.strikethroughToggleButton,
                new Separator(),
                this.leftJustfyToggleButton,
                this.centerJustfyToggleButton,
                this.rightJustfyToggleButton,
                new Separator(),
                this.fontColorPicker,
                this.spellCheckToggleButton
        );

        this.setTop(this.RichTextToolBar);
        this.RichTextToolBar.setStyle("-fx-border-color: red");

        this.scrollPane = new ScrollPane(this.RichTextControl);
        this.RichTextControl.setStyle("-fx-border-color: blue");
        this.setCenter(this.RichTextControl);

        scrollPane.setFitToWidth(true);
    }

    private void _initializeEvents() {


        this.scrollPane.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                RichTextControl.requestFocus();
            }
        });

        this.fontsCombobox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String choosenFont) {
                RichTextControl.SetFont(choosenFont);
            }
        });

        this.fontSizeComboBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String fontSizeAsText) {
                int fontSize = Integer.parseInt(fontSizeAsText);
                RichTextControl.SetFontSize(fontSize);
            }
        });

        this.boldToggleButton.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean isBold) {
                RichTextControl.SetBold(isBold);
            }
        });

        this.italicToggleButton.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean isItalic) {
                RichTextControl.SetItalic(isItalic);
            }
        });
        this.underlineToggleButton.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean isUnderline) {
                RichTextControl.SetUnderline(isUnderline);
            }
        });
        this.strikethroughToggleButton.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean isStrikethrough) {
                RichTextControl.SetStrikethrough(isStrikethrough);
            }
        });

        this.leftJustfyToggleButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RichTextControl.SetLeftJustify();
            }
        });

        this.centerJustfyToggleButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RichTextControl.SetCenterJustify();
            }
        });

        this.rightJustfyToggleButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RichTextControl.SetRightJustify();
            }
        });

        this.fontColorPicker.valueProperty().addListener(new ChangeListener<Color>() {
            @Override
            public void changed(ObservableValue<? extends Color> observable, Color oldValue, Color choosenColor) {
                RichTextControl.SetColor(choosenColor);
            }
        });

        this.spellCheckToggleButton.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean isSelected) {
                RichTextControl.SetSpellCheckingSupport(isSelected);
            }
        });
    }


}