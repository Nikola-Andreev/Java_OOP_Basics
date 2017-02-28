package B_Encapsulation.Exersises.E_PizzaCalories05;

class Topping {
    private String _type;
    private Double _weight;

    Topping(String type, Double weight) {
        this.setType(type);
        this.setWeight(weight);
    }

    private String getType() {
        return this._type;
    }

    private void setType(String type) {
        String temp = type.toLowerCase();
        if (temp.equals("meat") || temp.equals("veggies") || temp.equals("cheese") || temp.equals("sauce")) {
            this._type = type;
        } else {
            throw new IllegalArgumentException("Cannot place " + type + " on top of your pizza.");
        }
    }

    Double getWeight() {
        return this._weight;
    }

    private void setWeight(Double weight) {
        if (weight >= 1 && weight <=50) {
            this._weight = weight;
        } else {
            throw new IllegalArgumentException(this.getType() + " weight should be in the range [1..50].");
        }
    }

    public Double getCaloriesPerGram () {
        switch (this.getType().toLowerCase()){
            case"meat":
                return 2 * 1.2;
            case"veggies":
                return 2 * 0.8;
            case"cheese":
                return 2 * 1.1;
            case"sauce":
                return 2 * 0.9;
            default:
                return 0.0;
        }
    }
}