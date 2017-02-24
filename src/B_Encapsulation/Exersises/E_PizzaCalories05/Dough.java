package B_Encapsulation.Exersises.E_PizzaCalories05;

public class Dough {
    private String _flourType;
    private String _bakingTechnique;
    private double _weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private String getFlourType() {
        return _flourType;
    }

    private void setFlourType(String flourType) {
        String temp = flourType.toLowerCase();
        if (temp.equals("wholegrain") || temp.equals("white")) {
            this._flourType = flourType;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private String getBakingTechnique() {
        return _bakingTechnique;
    }

    private void setBakingTechnique(String bakingTechnique) {
        String temp = bakingTechnique.toLowerCase();
        if (temp.equals("crispy") || temp.equals("chewy") || temp.equals("homemade")) {
            this._bakingTechnique = bakingTechnique;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    public double getWeight() {
        return _weight;
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 200) {
            this._weight = weight;
        } else {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }

    public double getCaloriesPerGram (){
        Double bakingModifier = 0.0;
        switch (this.getBakingTechnique().toLowerCase()){
            case "crispy":
                bakingModifier = 0.9;
                break;
            case "chewy":
                bakingModifier = 1.1;
                break;
            case "homemade":
                bakingModifier = 1.0;
                break;
            default:
                break;
        }
        Double flourModifier = 0.0;
        switch (this.getFlourType().toLowerCase()){
            case "white":
                flourModifier = 1.5;
                break;
            case "wholegrain":
                flourModifier = 1.0;
                break;
            default:
                break;
        }
        return 2 * flourModifier * bakingModifier;
    }
}
