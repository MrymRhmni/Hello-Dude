package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Controller {
    @FXML
    private WebView webview;
    @FXML
    private TextField txtSearch;
    @FXML
    private Button keyserach;
    @FXML
    private ImageView image;


    @FXML
    private void searchClicked() {
        WebEngine webEngine = webview.getEngine();
        webEngine.load(txtSearch.getText());
    }

    @FXML
    private void textEntered(KeyEvent e) {
        if (e.getCode() == KeyCode.ENTER)
            searchClicked();
    }

}
