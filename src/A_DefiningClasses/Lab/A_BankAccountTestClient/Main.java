package A_DefiningClasses.Lab.A_BankAccountTestClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

   private static HashMap<Integer, BankAccount> accounts = new HashMap<>();

    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String command = scan.readLine();
        while (!"End".equals(command)){
            String[] commandArguments = command.split("\\s+");
            processCommand(commandArguments);
            command = scan.readLine();
        }
    }

    private static void processCommand(String[] commandArgument) {
        int id = Integer.valueOf(commandArgument[1]);
        switch (commandArgument[0]){
            case "Create":
                if (accounts.containsKey(id)){
                    System.out.println("Account already exists");
                } else {
                    accounts.put(id, new BankAccount());
                    accounts.get(id).setId(id);
                }
                break;
            case "Deposit":
                if (accounts.containsKey(id)){
                    accounts.get(id).deposit(Double.valueOf(commandArgument[2]));
                } else {
                    System.out.println("Account does not exist");
                }
                break;
            case "Withdraw":
                if (accounts.containsKey(id)){
                    accounts.get(id).withdraw(Double.valueOf(commandArgument[2]));
                } else {
                    System.out.println("Account does not exist");
                }
                break;
            case "Print":
                if (accounts.containsKey(id)){
                    System.out.println(accounts.get(id).toString());
                } else {
                    System.out.println("Account does not exist");
                }
                break;
        }
    }
}
