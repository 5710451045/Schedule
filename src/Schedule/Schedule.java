package Schedule;

import java.time.LocalDate;
import java.util.ArrayList;

public class Schedule {

    private ArrayList<Note> noteList;
    private LocalDate date;

    public Schedule (LocalDate date){
        noteList = new ArrayList<Note>();
        this.date = date;
    }

    public void addNote(String title){
        Note note = new Note(title, date);
        noteList.add(note);
    }

    public ArrayList<Note> getNotes(){
        return noteList;
    }

}
