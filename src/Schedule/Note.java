/**
 * @author Kantana Prachumphol 5710451045
 */
package Schedule;

import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Note {
    private SimpleStringProperty date;
    private SimpleStringProperty title;

    public Note(String title, LocalDate date){
        this.title = new SimpleStringProperty(title);
        this.date = new SimpleStringProperty(date.format(DateTimeFormatter.ofPattern("d/MM/uuuu")));
    }

    public String getTitle() {
        return title.getValue();
    }

    public String getDate() {
        return date.getValue();
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    @Override
    public String toString() {
        return title.getValue();
    }
}
