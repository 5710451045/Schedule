package Schedule;

import java.util.ArrayList;

public class Scheduler {
    public Scheduler (){
        scheduleList = new ArrayList<Schedule>();
    }
    public void addSchedule(String topic,String date){
        scheduleList.add(new Schedule(topic,date));
    }

    public String getScheduleListString(){
        String schedulesString = "";
        for (int i = 0;i<scheduleList.size();i++) {
            schedulesString+=scheduleList.get(i)+"\n";
        }
        return schedulesString;
    }

    ArrayList<Schedule> scheduleList;
}
