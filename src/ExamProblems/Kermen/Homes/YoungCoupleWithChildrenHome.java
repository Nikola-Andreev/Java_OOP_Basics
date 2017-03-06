package ExamProblems.Kermen.Homes;

import ExamProblems.Kermen.Devices.Fridge;
import ExamProblems.Kermen.Devices.Laptop;
import ExamProblems.Kermen.Devices.Room;
import ExamProblems.Kermen.Devices.Tv;
import ExamProblems.Kermen.Persons.Child;
import ExamProblems.Kermen.Persons.YoungPerson;

import java.util.ArrayList;

class YoungCoupleWithChildrenHome extends Home {
    YoungCoupleWithChildrenHome(YoungPerson person1, YoungPerson person2, Room room1, Room room2, Tv tv,
                                Fridge fridge, Laptop laptop1, Laptop laptop2, ArrayList<Child> kids) {
        super(person1, person2, room1, room2, tv, fridge, laptop1, laptop2, kids);
    }
}
