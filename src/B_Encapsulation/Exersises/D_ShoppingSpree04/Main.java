package B_Encapsulation.Exersises.D_ShoppingSpree04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<Person> personList = new ArrayList<>();
        HashMap<String, Product> productsMap = new HashMap<>();
        try {
            String[] people = bf.readLine().split(";");
            for (String personData : people) {
                int indexOfEqual = personData.indexOf("=");
                String name = personData.substring(0, indexOfEqual);
                double money = Double.valueOf(personData.substring(indexOfEqual+1));
                Person pesho = new Person(name, money);
                personList.add(pesho);
            }
            String[] products = bf.readLine().split(";");
            for (String productData : products) {
                int indexOfEqual = productData.indexOf("=");
                String productName = productData.substring(0,indexOfEqual);
                double productCost = Double.parseDouble(productData.substring(indexOfEqual+1));
                Product product = new Product(productName,productCost);
                productsMap.put(productName,product);
            }

            while (true) {
                String[] params = bf.readLine().split("\\s+");
                if (params[0].equals("END")) {
                    break;
                }
                String currentPersonName = params[0];
                String productName = params[1];
                for (Person person : personList) {
                    if (person.getName().equals(currentPersonName)) {
                        person.addProduct(productsMap.get(productName));
                    }
                }
            }
            personList.forEach(System.out::println);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
