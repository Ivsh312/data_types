package polinom.ru;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.SortedMap;
import java.util.TreeMap;

public class Polinom implements IPolonom{

    private ArrayList<Double> listValue1 = new ArrayList<Double>();
    private LinkedList<Double> listValue2 = new LinkedList<Double>();

    private SortedMap<Integer, Double> sortedMap1 = new TreeMap<Integer, Double>(new  Comparator<Integer>() {
        @Override
        public int compare(Integer k1, Integer k2) {
            return Integer.compare(k1, k2);
        }
    });
//
    private SortedMap<Integer, Double> sortedMap2 = new TreeMap<Integer, Double>(new  Comparator<Integer>() {
        @Override
        public int compare(Integer k1, Integer k2) {
            return Integer.compare(k1, k2);
        }
    });

    public Polinom(HashMap<Integer, Double> paramsPolinom1, HashMap<Integer, Double> paramsPolinom2) {
        sortedMap1.putAll(paramsPolinom1);
        sortedMap2.putAll(paramsPolinom2);
    }

    public Polinom(ArrayList<Double> listValue1, LinkedList<Double> listValue2) {
        this.listValue1 = listValue1;
        this.listValue2 = listValue2;
    }

    public void setParamsListValue1(ArrayList<Double> listValue1) {
        this.listValue1 = listValue1;
    }

    public void setParamsListValue22(LinkedList<Double> listValue2) {
        this.listValue2 = listValue2;
    }

    public ArrayList<Double> getParamsListValue1() {
        return this.listValue1;
    }

    public LinkedList<Double> getParamsListValue2() {
        return this.listValue2;
    }

    public void setParamsPolinom1(HashMap<Integer, Double> paramsPolinom1) {
        this.sortedMap1.putAll(paramsPolinom1);;
    }

    public void setParamsPolinom2(HashMap<Integer, Double> paramsPolinom2) {
        this.sortedMap1.putAll(paramsPolinom2);
    }

    public SortedMap<Integer, Double> getParamsPolinom1() {
        return this.sortedMap1;
    }

    public SortedMap<Integer, Double> getParamsPolinom2() {
        return this.sortedMap2;
    }

    public SortedMap<Integer, Double> summPolinoms() {
        SortedMap<Integer, Double> returnSumPolinoms = new TreeMap<Integer, Double>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
        int lastIndex1 = sortedMap1.lastKey();
        int lastIndex2 = sortedMap2.lastKey();
        if (lastIndex1 >= lastIndex2) {
            for (int i = 0; i <= lastIndex1; i++) {
                if (sortedMap1.get(i) != null) {
                    if (sortedMap2.get(i) != null) {
                        returnSumPolinoms.put(i, (sortedMap1.get(i) + sortedMap2.get(i)));
                    } else {
                        returnSumPolinoms.put(i, (sortedMap1.get(i)));
                    }
                } else {
                    if (sortedMap2.get(i) != null) {
                        returnSumPolinoms.put(i, (sortedMap2.get(i)));
                    }
                }
            }
            System.out.println(" returnSumPolinoms " + returnSumPolinoms);
            return returnSumPolinoms;
        }
        for (int i = 0; i <= lastIndex2; i++) {
            if (sortedMap2.get(i) != null) {
                if (sortedMap1.get(i) != null) {
                    returnSumPolinoms.put(i, (sortedMap2.get(i) + sortedMap1.get(i)));
                } else {
                    returnSumPolinoms.put(i, (sortedMap2.get(i)));
                }
            } else {
                if (sortedMap1.get(i) != null) {
                    returnSumPolinoms.put(i, (sortedMap1.get(i)));
                }
            }
        }
        return returnSumPolinoms;
    }

    public ArrayList<Double> proizvPolinoms() {
        int size = listValue2.size()-1 + listValue1.size()-1;
        ArrayList<Double> returnProizv = new ArrayList<Double>();
        for (int i = 0; i<=size; i++){
            returnProizv.add(0.0);
        }
        int i = 0;
        int j = 0, f = 0;
        int proizvIJ = 0;
        double proizvEl = 0.0;
        for (double el1 : this.listValue1) {
            j = 0;
            for (double el2 : this.listValue2) {
                proizvEl = el2 * el1;
                proizvIJ = i + j;
                if (i > 0) {
                    returnProizv.set(proizvIJ, (proizvEl + returnProizv.get(proizvIJ)));
                } else {
                    returnProizv.set(proizvIJ, proizvEl);
                }
                j++;
            }
            i++;
        }
        return returnProizv;
    }
}
