package ExamProblems.Kermen.Homes;

import ExamProblems.Kermen.Devices.*;
import ExamProblems.Kermen.Persons.Child;
import ExamProblems.Kermen.Persons.OldPerson;
import ExamProblems.Kermen.Persons.Person;
import ExamProblems.Kermen.Persons.YoungPerson;

import java.util.ArrayList;

public abstract class Home {
    private Double familyBudged;
    private ArrayList<Person> persons;
    private ArrayList<Device> devices;
    private ArrayList<Room> rooms;

    Home(YoungPerson person1, YoungPerson person2, Room room1, Room room2, Tv tv, Fridge fridge, Laptop laptop1, Laptop laptop2) {
        this.setDefaultParameters();
        this.addPerson(person1);
        this.addPerson(person2);
        this.addRoom(room1);
        this.addRoom(room2);
        this.addDevice(tv);
        this.addDevice(fridge);
        this.addDevice(laptop1);
        this.addDevice(laptop2);
    }

    Home(YoungPerson person1, YoungPerson person2,  Room room1, Room room2, Tv tv, Fridge fridge, Laptop laptop1,
         Laptop laptop2 , ArrayList<Child> kids) {
        this.setDefaultParameters();
        this.addPerson(person1);
        this.addPerson(person2);
        for (Child kid : kids) {
            this.addPerson(kid);
        }
        this.addRoom(room1);
        this.addRoom(room2);
        this.addDevice(tv);
        this.addDevice(fridge);
        this.addDevice(laptop1);
        this.addDevice(laptop2);
    }

    Home(OldPerson person1, OldPerson person2, Room room1, Room room2, Room room3, Tv tv, Fridge fridge, Stove stove) {
        this.setDefaultParameters();
        this.addPerson(person1);
        this.addPerson(person2);
        this.addDevice(tv);
        this.addDevice(fridge);
        this.addDevice(stove);
        this.addRoom(room1);
        this.addRoom(room2);
        this.addRoom(room3);
    }

    Home(YoungPerson person1, Room room, Laptop laptop) {
        this.setDefaultParameters();
        this.addPerson(person1);
        this.addRoom(room);
        this.addDevice(laptop);
    }
    Home(OldPerson person1, Room room) {
        this.setDefaultParameters();
        this.addPerson(person1);
        this.addRoom(room);
    }

    private void setDefaultParameters () {
        this.setPersons();
        this.setDevices();
        this.setDefaultFamilyBudged();
        this.setRooms();
    }

    public Double getFamilyBudged() {
        return this.familyBudged;
    }

    private void setDefaultFamilyBudged() {
        this.familyBudged = 0.0;
    }

    public void setFamilyBudged(Double newBudged) {
        this.familyBudged = newBudged;
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    private void setPersons() {
        this.persons = new ArrayList<>();
    }

    private ArrayList<Device> getDevices() {
        return this.devices;
    }

    private void setDevices() {
        this.devices = new ArrayList<>();
    }

    private ArrayList<Room> getRooms() {
        return rooms;
    }

    private void setRooms() {
        this.rooms = new ArrayList<>();
    }

    private void addPerson(Person p) {
        this.getPersons().add(p);
    }

    private void addDevice(Device d){
        this.getDevices().add(d);
    }

    private void addRoom (Room r) {
        this.getRooms().add(r);
    }

    public double getTotalIncome() {
        final Double[] totalIncome = {0.0};
        persons.forEach(p -> totalIncome[0] += p.getIncome());
        return totalIncome[0];
    }

    public double getTotalCost() {
        final Double[] totalCost = {0.0};
        persons.forEach(p -> totalCost[0] += p.getCosts());
        devices.forEach(d -> totalCost[0] += d.getCost());
        rooms.forEach(r -> totalCost[0] += r.getCost());
        return totalCost[0];
    }
}