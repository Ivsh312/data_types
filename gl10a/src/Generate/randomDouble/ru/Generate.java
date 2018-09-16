package Generate.randomDouble.ru;

import static java.lang.Math.random;
import java.util.ArrayList;

public class Generate implements IGenerate {

    private ArrayList<Double> generateRandom = new ArrayList<Double>();

    public Generate(int longing) {
        for (int i = 0; i < longing; i++) {
            generateRandom.add(random());
        }
    }

    public ArrayList<Double> getRandom() {
        return generateRandom;
    }
}
