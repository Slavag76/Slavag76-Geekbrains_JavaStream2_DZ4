package sample;


import javafx.beans.property.SimpleStringProperty;

public class RowWord {

    private SimpleStringProperty word;


    public RowWord(String word) {
        this.word = new SimpleStringProperty(word);

    }

    public String getWord() {
        return word.get();
    }

    public SimpleStringProperty wordProperty() {
        return word;
    }

    public void setWord(String word) {
        this.word.set(word);
    }


}
