package setSumAllElements.ru;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SumElementsSet implements ISumAllElements{
    private LinkedHashSet <Double> Numbers;
    
    public SumElementsSet(LinkedHashSet <Double> Numbers){
        this.Numbers = Numbers;
    }
    public void setNumbers(LinkedHashSet <Double> Numbers){
        this.Numbers = Numbers;
    }
    public LinkedHashSet <Double> setNumbers(){
        return this.Numbers;
    }
    public double sumElements(){
        double a = 0;
        int n = this.Numbers.size()-1;
        ArrayList <Double> arrayBuf = new ArrayList <Double>();
        arrayBuf.addAll(Numbers);
        Double addElement;
        while (n > 1){
            System.out.println("n "+n);
            for (int i = 1, j =0; i <= n; i+=2, ++j){               
                addElement = arrayBuf.get(i)+arrayBuf.get(i-1);
                arrayBuf.set(j, addElement);
                if(i+1==n){
                    j++;
                    addElement = arrayBuf.get(n);
                    arrayBuf.set(j, addElement);
                }
            }
            
            n /=2;         
        }
       a = arrayBuf.get(0)+arrayBuf.get(1);
        return a;
    }
}
