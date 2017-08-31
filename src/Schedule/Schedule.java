package Schedule;

public class Schedule {
    private String topic;
    private String date;

    public Schedule (String topic,String date){
        this.topic = topic;
        this.date = date;
    }

    @Override
    public String toString() {
        return topic + " " + date;
    }
}
