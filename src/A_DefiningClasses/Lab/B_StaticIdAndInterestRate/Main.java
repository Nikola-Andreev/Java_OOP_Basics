package A_DefiningClasses.Lab.B_StaticIdAndInterestRate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;

public class Main {

    private static HashMap<Integer, BankAccount> accounts = new HashMap<>();
    private static int id = 0;

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
        switch (commandArgument[0]){
            case "Create":
                accounts.put(++id, new BankAccount());
                accounts.get(id).setId(id);
                System.out.println("Account " + accounts.get(id).toString() +" created");
                break;
            case "Deposit":
                int targetId = Integer.valueOf(commandArgument[1]);
                if (accounts.containsKey(targetId)){
                    accounts.get(targetId).deposit(Double.valueOf(commandArgument[2]));
                    DecimalFormat df = new DecimalFormat("#.##");
                    System.out.printf("Deposited %s to %s%n", df.format(Double.valueOf(commandArgument[2])), accounts.get(targetId).toString());
                } else {
                    System.out.println("Account does not exist");
                }
                break;
            case "SetInterest":
                    BankAccount.setInterestRate(Double.valueOf(commandArgument[1]));
                break;
            case "GetInterest":
                targetId = Integer.valueOf(commandArgument[1]);
                if (accounts.containsKey(targetId)){
                    DecimalFormat df = new DecimalFormat("0.00");
                    System.out.println(df.format(accounts.get(targetId).getInterest(Integer.valueOf(commandArgument[2]))));
                } else {
                    System.out.println("Account does not exist");
                }
                break;
        }
    }
}