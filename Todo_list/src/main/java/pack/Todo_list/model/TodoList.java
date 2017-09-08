package pack.Todo_list.model;

import javax.persistence.*;

@Entity
public class TodoList
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eventNo;
    @Column 
    private String eventName;
    @Column
    private String eventDescription;
    @Column
    private String location;
    @Column
    private String date;
    @Column
    private String time;


    public int getEventNo() {
        return eventNo;
    }

    public void setEventNo(int eventNo) {
        this.eventNo = eventNo;
    }

   public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }
    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
 
   public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
     public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
   
}