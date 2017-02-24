package B_Encapsulation.Exersises.F_FootballTeamGenerator06;

import java.util.HashMap;

public class Team {
    private String _name;
    private double _rating;
    private HashMap<String, Player> _players;

    public Team(String name) {
        this.setName(name);
        this.setPlayers();
        this.setRating();
    }

    private void setPlayers() {
        this._players = new HashMap<>();
    }

    public String getName() {
        return this._name;
    }

    private void setName(String name) {
        if (name != null && !name.trim().equals("")) {
            this._name = name;
        } else {
            throw new IllegalArgumentException("A name should not be empty.");
        }
    }

    private double getRating() {
        return this._rating;
    }

    private void setRating() {
        double rating = 0;
        for (String player : this._players.keySet()) {
            rating +=  Math.round(this._players.get(player).getSkill());
        }
        if (this._players.size() > 0) {
            this._rating = rating / this._players.size();
        } else {
            this._rating = rating;
        }
    }

    public void addPlayer(Player p) {
        this._players.put(p.getName(), p);
        this.setRating();
    }

    public void removePlayer(String name) {
        if (this._players.containsKey(name)) {
            this._players.remove(name);
        } else {
            throw new IllegalArgumentException("Player "+ name +" is not in "+ this.getName() +" team.");
        }
        this.setRating();
    }

    @Override
    public String toString(){
        return this.getName() + " - " + Math.round(this.getRating());
    }
}