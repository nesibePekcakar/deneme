package com.example.dictionarytest;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController {


    @FXML
    private TextField srcBar;

    @FXML
    public TextArea engWord;
    @FXML
    private Label wordSrced;
    @FXML
    private Button searchWord;
    @FXML
    private Button editDictionary;
    @FXML
    private Button help;




    @FXML
    void srcBarAction(ActionEvent event) {
        Stage stage1 = (Stage) srcBar.getScene().getWindow();
        String srcWord = srcBar.getText();
        wordSrced.setText(srcWord);

    }
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void searchWordButton(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SearchWordScene.fxml"));
        stage=(Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 600, 450);
        stage.setScene(scene);
        stage.show();

    }

    public void editDictionaryButton(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("EditDictionaryScene.fxml"));
        scene = new Scene(fxmlLoader.load(), 600, 450);
        stage=(Stage)((Node)e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    public void helpButton(ActionEvent e) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HelpScene.fxml"));
        stage=(Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 600, 450);
        stage.setScene(scene);
        stage.show();

    }





}
