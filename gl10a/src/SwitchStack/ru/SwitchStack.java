package SwitchStack.ru;

import java.util.Stack;

public class SwitchStack implements ISwitchStack{
    private Stack <Integer> stack1;
    private Stack <Integer> stack2;
    public SwitchStack(Stack <Integer> stack1, Stack <Integer> stack2){
        this.stack1 = stack1;
        this.stack2 = stack2;
    }
    public void setStak1(Stack <Integer> stack1){
        this.stack1 = stack1;
    }
    public void setStak2(Stack <Integer> stack2){
        this.stack2 = stack2;
    }
    public Stack getStak1(){
        return this.stack1;
    }
    public Stack getStak2(){
        return this.stack2;
    }
    public void switchElementsStack(){
        Object buf = this.stack1.clone();
        this.stack1 = this.stack2;
        this.stack2 = (Stack) buf;
    }
}
