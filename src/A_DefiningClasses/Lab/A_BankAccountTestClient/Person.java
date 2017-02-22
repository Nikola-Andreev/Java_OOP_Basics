package A_DefiningClasses.Lab.A_BankAccountTestClient;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int age;
    private List<BankAccount> accounts;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.accounts = new ArrayList<>();
    }

    Person(String name, int age, List<BankAccount> accounts) {
        this.name = name;
        this.age = age;
        this.accounts = accounts;
    }

    public Double getBalance() {
        return this.accounts.stream().mapToDouble(BankAccount::getBalance).sum();
    }
}
