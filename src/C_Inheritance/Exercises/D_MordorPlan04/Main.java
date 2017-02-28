package C_Inheritance.Exercises.D_MordorPlan04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        Hero gandalf = new Hero();
        String[] inputFoods = scan.readLine().split("\\s+");

        for (String inputFood : inputFoods) {
            gandalf.eatFood(inputFood);
        }

        gandalf.setMode();
        System.out.println(gandalf.getPoints());
        System.out.println(gandalf.getMode());
    }
}
