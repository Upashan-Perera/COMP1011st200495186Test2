package com.example.comp1011st200495186test2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class SongsViewController  {

    @FXML
    private Label averageLabel;

    @FXML
    private ListView<Song> resultSongsListView;

    @FXML
    private TextField searchTextField;

    @FXML
    private ComboBox<Song> selectSongComboBox;

    @FXML
    private Label songsShowingLabel;

    @FXML
    private Label yearsOnBillboardLabel;

}
