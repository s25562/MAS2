package pck;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private List<Participation> participationList = new ArrayList<>();

    public Project(String name){
        this.name = name;
    }

    public void addParticipationInternally(Participation participation){
        this.participationList.add(participation);
    }

    private List<Participation> getParticipationList(){
        return this.participationList;
    }
}
