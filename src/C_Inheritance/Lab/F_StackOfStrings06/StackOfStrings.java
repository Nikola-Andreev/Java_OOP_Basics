package C_Inheritance.Lab.F_StackOfStrings06;

import java.util.ArrayList;

public class StackOfStrings {
    private ArrayList<String> data;

    public StackOfStrings() {
        this.setData(new ArrayList<>());
    }

    private void setData(ArrayList<String> data) {
        this.data = data;
    }

    public void push(String item) {
        data.add(item);
    }

    public String pop() {
        String temp = data.get(0);
        data.remove(0);
        return temp;
    }

    public String peek() {
        return data.get(0);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}
