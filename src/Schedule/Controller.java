package Schedule;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    TextField topic,date;
    @FXML
    Button addButt;
    @FXML
    TextArea result;

    Scheduler list = new Scheduler();

    @FXML
    public void add(){
        list.addSchedule(topic.getText(),date.getText());
        result.setText(list.getScheduleListString());
    }
}