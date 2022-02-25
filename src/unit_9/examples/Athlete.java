package unit_9.examples;

public class Athlete {
    // Instance variables
    private String name;
    private int age;

    // Constructor
    public Athlete(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class TeamAthlete extends Athlete {
    private String teamName;
    private String sport;

    public TeamAthlete(String name, int age, String teamName, String sport){
        super(name, age);
        this.teamName = teamName;
        this.sport = sport;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName(){
        return teamName;
    }

    public void setSport(String sport){
        this.sport = sport;
    }

    public String getSport(){
        return sport;
    }
}
