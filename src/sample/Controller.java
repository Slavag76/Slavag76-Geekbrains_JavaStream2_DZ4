package sample;

import javafx.beans.property.Property;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;


public class Controller {

    @FXML
    private TextField inputField;

    @FXML
    private ListView<String> listView;

    @FXML
    private TableView<RowWord> tableView; /*задаем ID таблицы*/
    @FXML
    private  TableColumn<RowWord, String> wordTableColumn; /*задаем ID столбца*/


    private final ObservableList<RowWord> frequencyByWord = FXCollections.observableArrayList(
            new RowWord("Иванов"),
            new RowWord("Петров"),
            new RowWord("Сидоров")
    );



    @FXML
    public void initialize() {
        wordTableColumn.setCellValueFactory(new PropertyValueFactory<>("word"));
        tableView.setItems(frequencyByWord);
    }


    @FXML
    public void addWord() {
        String word = inputField.getText();
        if (word.isBlank()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Input Error");
            alert.setHeaderText("Ошибка ввода сообщенния");
            alert.setContentText("Нельзя вводить пустое сообщеие");
            alert.showAndWait();
            return;
//            System.out.println("Нельзя добавлять ничего");
        } else {
            addWordToList(word);
        }
        inputField.clear();
    }


    private void addWordToList(String word) {
        listView.getItems().add(word);
    }


    @FXML
    public void exit(){
        System.exit(1);
    }


}
