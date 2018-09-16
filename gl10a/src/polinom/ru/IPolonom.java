package polinom.ru;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.SortedMap;

public interface IPolonom {
    public void setParamsListValue1(ArrayList<Double> listValue1);

    public void setParamsListValue22(LinkedList<Double> listValue2) ;

    public ArrayList<Double> getParamsListValue1();

    public LinkedList<Double> getParamsListValue2();

    public void setParamsPolinom1(HashMap<Integer, Double> paramsPolinom1);

    public void setParamsPolinom2(HashMap<Integer, Double> paramsPolinom2);

    public SortedMap<Integer, Double> getParamsPolinom1();

    public SortedMap<Integer, Double> getParamsPolinom2();

    public SortedMap<Integer, Double> summPolinoms() ;
        

    public ArrayList<Double> proizvPolinoms();
}
