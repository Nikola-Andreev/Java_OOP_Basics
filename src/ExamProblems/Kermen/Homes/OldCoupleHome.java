package ExamProblems.Kermen.Homes;

import ExamProblems.Kermen.Devices.Fridge;
import ExamProblems.Kermen.Devices.Room;
import ExamProblems.Kermen.Devices.Stove;
import ExamProblems.Kermen.Devices.Tv;
import ExamProblems.Kermen.Persons.OldPerson;

class OldCoupleHome extends Home {
    OldCoupleHome(OldPerson person1, OldPerson person2, Room room1, Room room2, Room room3, Tv tv, Fridge fridge, Stove stove) {
        super(person1, person2, room1, room2, room3, tv, fridge, stove);
    }
}
