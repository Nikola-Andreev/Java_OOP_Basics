package ExamProblems.Kermen;

import ExamProblems.Kermen.Devices.Food;
import ExamProblems.Kermen.Devices.Toy;
import ExamProblems.Kermen.Homes.HomeFactory;
import ExamProblems.Kermen.Persons.Child;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int counter = 1;

        while (true) {
            String input = scan.readLine();
            if (input.equals("Democracy")) break;
            String[] inputTokens = input.split("\\) ");
            String command = input.split("\\(")[0];

            if (counter % 3 == 0 && command.equals("EVN bill")) {
                City.giveSalaries();
            }

            if (command.contains("YoungCouple") || command.equals("OldCouple")) {
                Double salary1 = Double.valueOf(inputTokens[0].split("\\(")[1].split(", ")[0]);
                Double salary2 = Double.valueOf(inputTokens[0].split("\\(")[1].split(", ")[1].replace(")",""));
                Double tvCost = Double.valueOf(inputTokens[1].split("\\(")[1].replace(")",""));
                Double fridgeCost = Double.valueOf(inputTokens[2].split("\\(")[1].replace(")",""));
                Double laptopCost = Double.valueOf(inputTokens[3].split("\\(")[1].replace(")",""));
                switch (command) {
                    case "YoungCouple":
                        HomeFactory.createYoungCoupleHome(salary1, salary2, tvCost, fridgeCost, laptopCost);
                        break;
                    case "YoungCoupleWithChildren":
                        ArrayList<Child> kids = new ArrayList<>();
                        for (int i = 4; i < inputTokens.length; i++) {
                            kids.add(createChild(inputTokens, i));
                        }
                        HomeFactory.createYoungCoupleWithChildrenHome(salary1, salary2, tvCost, fridgeCost, laptopCost, kids);
                        break;
                    default:
                        HomeFactory.createOldCoupleHomeHome(salary1, salary2, tvCost, fridgeCost, laptopCost);
                        break;
                }
            } else if (command.equals("AloneYoung")) {
                Double salary = Double.valueOf(inputTokens[0].split("\\(")[1].replace(")",""));
                Double laptopCost = Double.valueOf(inputTokens[1].split("\\(")[1].replace(")",""));
                HomeFactory.createAloneYoungHome(salary, laptopCost);
            } else if (command.equals("AloneOld")) {
                Double salary = Double.valueOf(inputTokens[0].split("\\(")[1].replace(")",""));
                HomeFactory.createAloneOldHomeHome(salary);
            } else if (command.equals("EVN")) {
                System.out.println("Total consumption: " + City.getCityElectricityConsumption());
            } else {
                City.payBillsAndRemoveHomes();
            }
            if (counter % 3 == 0 && !command.equals("EVN bill")) {
                City.giveSalaries();
            }
            counter++;
        }
        System.out.println("Total population: " + City.getPopulation());
    }

    private static Child createChild(String[] inputTokens, int index) {
        String[] childTokens = inputTokens[index].split("\\(")[1].split(", ");
        Food food = new Food(Double.valueOf(childTokens[0]));
        ArrayList<Toy> toys = new ArrayList<>();
        for (int i = 1; i < childTokens.length; i++) {
            if (i == childTokens.length - 1){
                toys.add(new Toy(Double.valueOf(childTokens[i].replace(")",""))));
            } else {
                toys.add(new Toy(Double.valueOf(childTokens[i])));
            }
        }
        return new Child(food, toys);
    }
}