package MNK.ru;

import Mistake.ru.CounLogicalException;
import java.util.ArrayDeque;
import java.util.Stack;

public interface IMNK {
     public void setIStack(Stack<Double> IStack);
     public void setUDeue(ArrayDeque<Double> UDeue);
    public Stack<Double> getIStack();
     public ArrayDeque<Double> getUDeue();
    public double MNKForR()throws CounLogicalException;
}
