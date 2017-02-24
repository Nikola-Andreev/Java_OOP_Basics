package B_Encapsulation.Exersises.F_FootballTeamGenerator06;

public class Player {
    private String _name;
    private double _endurance;
    private double _sprint;
    private double _dribble;
    private double _passing;
    private double _shooting;
    private double _skill;


    public Player(String name, double endurance, double sprint, double dribble, double passing, double shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.set_shooting(shooting);
        this.setSkill();
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

    private double getEndurance() {
        return this._endurance;
    }

    private void setEndurance(double endurance) {
        if (endurance < 0 || endurance > 100){
            throw new IllegalArgumentException("Endurance should be between 0 and 100.");
        }
        this._endurance = endurance;
    }

    private double getSprint() {
        return this._sprint;
    }

    private void setSprint(double sprint) {
        if (sprint < 0 || sprint > 100){
            throw new IllegalArgumentException("Sprint should be between 0 and 100.");
        }
        this._sprint = sprint;
    }

    private double getDribble() {
        return this._dribble;
    }

    private void setDribble(double dribble) {
        if (dribble < 0 || dribble > 100){
            throw new IllegalArgumentException("Dribble should be between 0 and 100.");
        }
        this._dribble = dribble;
    }

    private double getPassing() {
        return this._passing;
    }

    private void setPassing(double passing) {
        if (passing < 0 || passing > 100){
            throw new IllegalArgumentException("Passing should be between 0 and 100.");
        }
        this._passing = passing;
    }

    private double getShooting() {
        return this._shooting;
    }

    private void set_shooting(double shooting) {
        if (shooting < 0 || shooting > 100){
            throw new IllegalArgumentException("Shooting should be between 0 and 100.");
        }
        this._shooting = shooting;
    }

    public double getSkill() {
        return this._skill;
    }

    private void setSkill() {
        this._skill = (this.getDribble() + this.getEndurance() + this.getPassing() + this.getShooting() + this.getSprint()) / 5d;
    }
}
