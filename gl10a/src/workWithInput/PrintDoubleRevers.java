package workWithInput;

import java.util.Stack;

public class PrintDoubleRevers implements IPrintDoubleRevers{
    private double InputDouble;
    public void setInputDouble(double InputDouble){
        this.InputDouble = InputDouble;
    }
     public double getInputDouble(){
        return this.InputDouble;
    }
    public PrintDoubleRevers(double InputDouble){
        this.InputDouble = InputDouble;
    }
    public void reversDouble(){
        double buf = this.InputDouble;
        String str = (buf+"").replace(".","");
        char[] simbls = str.toCharArray();
        Stack s = new Stack(); 
        for(char a : simbls){
            s.push(a);
        }
        while(!s.empty()){
            System.out.println(s.pop());
        }
    }
}
