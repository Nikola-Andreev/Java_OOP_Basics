package ExamProblems.Kermen.Homes;

import ExamProblems.Kermen.City;
import ExamProblems.Kermen.Devices.*;
import ExamProblems.Kermen.Persons.Child;
import ExamProblems.Kermen.Persons.OldPerson;
import ExamProblems.Kermen.Persons.YoungPerson;

import java.util.ArrayList;

public class HomeFactory {

    public static void createYoungCoupleHome (Double person1Salary, Double person2Salary, Double tvCost, Double fridgeCost, Double laptopCost) {
        YoungPerson person1 = new YoungPerson(person1Salary);
        YoungPerson person2 = new YoungPerson(person2Salary);
        Tv tv = new Tv(tvCost);
        Fridge fridge = new Fridge(fridgeCost);
        Laptop laptop1 = new Laptop(laptopCost);
        Laptop laptop2 = new Laptop(laptopCost);
        Room room1 = new Room(20);
        Room room2 = new Room(20);
        City.addHome(new YoungCoupleHome(person1, person2, room1, room2, tv, fridge, laptop1, laptop2));
    }

    public static void createYoungCoupleWithChildrenHome (Double person1Salary, Double person2Salary, Double tvCost,
                                                          Double fridgeCost, Double laptopCost, ArrayList<Child> kids) {
        YoungPerson person1 = new YoungPerson(person1Salary);
        YoungPerson person2 = new YoungPerson(person2Salary);
        Tv tv = new Tv(tvCost);
        Fridge fridge = new Fridge(fridgeCost);
        Laptop laptop1 = new Laptop(laptopCost);
        Laptop laptop2 = new Laptop(laptopCost);
        Room room1 = new Room(30);
        Room room2 = new Room(30);
        City.addHome(new YoungCoupleWithChildrenHome(person1, person2, room1, room2, tv, fridge, laptop1, laptop2, kids));
    }

    public static void createAloneYoungHome (Double person1Salary, Double laptopCost) {
        YoungPerson person = new YoungPerson(person1Salary);
        Laptop laptop = new Laptop(laptopCost);
        Room room = new Room(10);
        City.addHome(new AloneYoungHome(person, room, laptop));
    }

    public static void createOldCoupleHomeHome (Double pension1, Double pension2, Double tvCost, Double fridgeCost, Double stoveCost) {
        OldPerson person1 = new OldPerson(pension1);
        OldPerson person2 = new OldPerson(pension2);
        Tv tv = new Tv(tvCost);
        Fridge fridge = new Fridge(fridgeCost);
        Stove stove = new Stove(stoveCost);
        Room room1 = new Room(15);
        Room room2 = new Room(15);
        Room room3 = new Room(15);
        City.addHome(new OldCoupleHome(person1, person2, room1, room2, room3, tv, fridge, stove));
    }

    public static void createAloneOldHomeHome (Double pension) {
        OldPerson person = new OldPerson(pension);
        Room room = new Room(15);
        City.addHome(new AloneOldHome(person, room));
    }
}