package pck;

public class Participation {
    private Employee employee;
    private Project project;
    private int hours;

    public Participation(Employee employee, Project project, int hours){
        this.employee = employee;
        this.project = project;
        this.hours = hours;

        employee.addParticipationInternally(this);
        project.addParticipationInternally(this);
    }

    public int getHours(){
        return this.hours;
    }
}
