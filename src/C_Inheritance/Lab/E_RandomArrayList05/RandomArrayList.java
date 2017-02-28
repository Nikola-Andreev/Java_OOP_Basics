package C_Inheritance.Lab.E_RandomArrayList05;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList{
    private Random rnd;

    public Object getRandomElement () {
        int index = this.rnd.nextInt(super.size());
        Object element = super.get(index);
        super.set(index, super.remove(super.size() - 1  ));
        return element;
    }
}
