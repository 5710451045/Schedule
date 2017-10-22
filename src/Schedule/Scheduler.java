/**
 * @author Kantana Prachumphol 5710451045
 */
package Schedule;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Scheduler {

    private HashMap<LocalDate, Schedule> scheduleMap;

    public Scheduler (){
        scheduleMap = new HashMap<LocalDate, Schedule>();
    }

    public void addNote(LocalDate date, String title){
        Schedule schedule;
        if (scheduleMap.containsKey(date)){
            schedule = scheduleMap.get(date);
        }else {
            schedule = new Schedule(date);
        }
        schedule.addNote(title);
        scheduleMap.put(date, schedule);
    }

    public ArrayList<Note> getNotesByDate(LocalDate date){
        if (scheduleMap.containsKey(date)) {
            return scheduleMap.get(date).getNotes();
        }else {
            return new ArrayList<Note>();
        }
    }

    public ArrayList<Note> getAllNotes(){
        ArrayList<Note> notes = new ArrayList<Note>();
        for (Schedule schedule : scheduleMap.values()){
            notes.addAll(schedule.getNotes());
        }
        return notes;
    }

}
