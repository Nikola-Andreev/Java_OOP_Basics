package B_Encapsulation.Exersises.E_PizzaCalories05;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Pizza {
    private String _name;
    private ArrayList<Topping> _toppings;
    private Dough _dough;


    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        this.setToppings(new ArrayList<>());
        this.setNumberOfToppings(numberOfToppings);
    }

    public String getName() {
        return _name;
    }

    private void setName(String name) {
        if (name.length() > 0 || name.length() < 16) {
            this._name = name;
        } else {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
    }

    private void setToppings(ArrayList<Topping> toppings) {
        this._toppings = toppings;
    }

    public void setDough(Dough dough) {
        this._dough = dough;
    }

    private int getTotalCalories(){
        int calories = 0;
        for (Topping topping : this._toppings) {
            calories += topping.getCaloriesPerGram() * topping.getWeight();
        }
        calories += this._dough.getCaloriesPerGram() * this._dough.getWeight();
        return calories;
    }

    public void addTopping(Topping t){
        this._toppings.add(t);
    }

    @Override
    public String toString () {
        DecimalFormat df = new DecimalFormat("0.00");
        return this.getName() + " - " + df.format(this.getTotalCalories());
    }

    private void setNumberOfToppings(int numberOfToppings) {
        if (numberOfToppings < 1 || numberOfToppings > 15){
            throw  new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }
}
