package SwitchStack.ru;

import java.util.Stack;

public interface ISwitchStack {

    public void setStak1(Stack<Integer> stack1);

    public void setStak2(Stack<Integer> stack2);

    public Stack getStak1();

    public Stack getStak2();

    public void switchElementsStack();
}
