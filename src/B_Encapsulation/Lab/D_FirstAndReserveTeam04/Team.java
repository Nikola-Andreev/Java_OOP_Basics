package B_Encapsulation.Lab.D_FirstAndReserveTeam04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Person> reserveTeamPlayers;
    private List<Person> firstTeamPlayers;

    public Team(String name) {
        this.name = name;
        reserveTeamPlayers = new ArrayList<>();
        firstTeamPlayers = new ArrayList<>();
    }

    public void addPlayer(Person person) {
        if (person.getAge() < 40){
            this.firstTeamPlayers.add(person);
        } else {
            this.reserveTeamPlayers.add(person);
        }
    }

    public List<Person> getFirstTeam () {
        return Collections.unmodifiableList(this.firstTeamPlayers);
    }

    public List<Person> getReserveTeam () {
        return Collections.unmodifiableList(this.reserveTeamPlayers);
    }
}
