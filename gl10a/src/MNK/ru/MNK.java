package MNK.ru;

import Mistake.ru.CounLogicalException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Stack;

public class MNK implements IMNK{
    private Stack <Double> IStack;
    private ArrayDeque<Double> UDeue;
    public MNK(Stack <Double> IStack, ArrayDeque<Double> UDeue){
        this.IStack = IStack;
        this.UDeue = UDeue;
    }
    public void setIStack(Stack<Double> IStack){
        this.IStack = this.IStack;
    }
     public void setUDeue(ArrayDeque<Double> UDeue){
        this.UDeue = this.UDeue;
    }
    public Stack<Double> getIStack(){
       return this.IStack;
    }
     public ArrayDeque<Double> getUDeue(){
       return this.UDeue;
    }
    public double MNKForR()throws CounLogicalException{
        double R = 0;
        ArrayDeque<Double> r = new ArrayDeque<Double>();
        Iterator<Double> iterI = this.IStack.iterator();
        Iterator<Double> iterU = this.UDeue.iterator();
        double U, I, bufR;
        System.out.println(R);
        while(iterI.hasNext()){
            U = iterU.next();
            I = iterI.next();
            if(I < 0){
                throw new CounLogicalException("деление на ноль из-за i=0");
            }
            bufR = U/I;
            System.out.println(bufR);
            r.add((bufR));
            R = R+bufR;            
        }
        R /= r.size();
        return R;
    }
}
