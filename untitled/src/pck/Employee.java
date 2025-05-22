package pck;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Participation> participationList = new ArrayList<>();

    public Employee(String name){
        this.name = name;
    }

    public void addParticipation(Project project, int hours){
        new Participation(this, project, hours);
    }

    public List<Participation> getParticipationList(){
        return this.participationList;
    }

    public void addParticipationInternally(Participation participation){
        this.participationList.add(participation);
    }
}
