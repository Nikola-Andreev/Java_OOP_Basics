package C_Inheritance.Exercises.D_MordorPlan04;

abstract class MoodFactory extends FoodFactory{
    private String _mode;

    String getMode() {
        return this._mode;
    }

    void setMode() {
        if (this.getPoints() < -5) {
            this._mode = "Angry";
        } else if (this.getPoints() < 0) {
            this._mode = "Sad";
        } else if (this.getPoints() <= 15) {
            this._mode = "Happy";
        } else {
            this._mode = "JavaScript";
        }
    }
}
