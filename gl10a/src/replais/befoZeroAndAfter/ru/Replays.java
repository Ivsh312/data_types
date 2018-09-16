package replais.befoZeroAndAfter.ru;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Replays implements IReplays {

    private ArrayList<Double> massForRaplays = new ArrayList<Double>();

    public Replays(ArrayList<Double> massForRaplays) {
        this.massForRaplays = massForRaplays;
    }

    public void setMassForRaplays(ArrayList<Double> massForRaplays) {
        this.massForRaplays = massForRaplays;
    }

    public ArrayList<Double> gatMassForRaplays() {
        return this.massForRaplays;
    }

    public ArrayList<Double> replays() {
        ArrayList<Double> buff = this.massForRaplays;
        Iterator iter = buff.iterator();
        double save;
        Collections.sort(buff, new Comparator<Double>() {
            public int compare(Double o1, Double o2) {
                return Double.compare(o1, o2);
            }
        });
        return buff;
    }
}
