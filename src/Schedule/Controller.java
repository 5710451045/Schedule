package Schedule;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
/**
 * @author Kantana Prachumphol 5710451045
 */
public class Controller {
    @FXML
    TextField topic;
    @FXML
    DatePicker date, filterDate;
    @FXML
    Button addButt, allButt;
    @FXML
    TableView<Note> result;

    Scheduler scheduler = new Scheduler();

    @FXML
    public void add(){
        scheduler.addNote(date.getValue(), topic.getText());
        setTable(scheduler.getNotesByDate(date.getValue()));
    }

    @FXML
    public void showAll(){
        setTable(scheduler.getAllNotes());
    }

    @FXML
    public void showByDate(){
        setTable(scheduler.getNotesByDate(filterDate.getValue()));
    }

    public void setTable(ArrayList<Note> notes){
        ObservableList<Note> data = FXCollections.observableArrayList(notes);
        result.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("date"));
        result.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("title"));
        result.setItems(data);
    }
}