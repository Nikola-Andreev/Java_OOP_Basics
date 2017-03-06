package ExamProblems.Kermen;

import ExamProblems.Kermen.Homes.Home;

import java.util.ArrayList;

public class City {
    public static String name = "Kermen";
    private static ArrayList<Home> homes = new ArrayList<>();

    public static void addHome (Home h) {
        homes.add(h);
    }

    public static void giveSalaries() {
        for (Home currentHome : homes) {
            currentHome.setFamilyBudged(currentHome.getFamilyBudged() + currentHome.getTotalIncome());
        }
    }

    public static void payBillsAndRemoveHomes () {
        ArrayList<Home> homesLeft = new ArrayList<>();
        for (Home currentHome : homes) {
            if (currentHome.getFamilyBudged() >= currentHome.getTotalCost()) {
                currentHome.setFamilyBudged(currentHome.getFamilyBudged() - currentHome.getTotalCost());
                homesLeft.add(currentHome);
            }
        }
        homes = homesLeft;
    }

    public static int getPopulation() {
        final int[] totalPopulation = {0};
        homes.forEach(h -> totalPopulation[0] += h.getPersons().size());
        return totalPopulation[0];
    }

    public static Double getCityElectricityConsumption() {
        final Double[] totalCityConsumption = {0.0};
        homes.forEach(h -> totalCityConsumption[0] += h.getTotalCost());
        return totalCityConsumption[0];
    }
}
