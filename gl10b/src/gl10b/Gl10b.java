/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gl10b;

import delite.elemetArray.ru.RemoveEvery2;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Lenovo
 */
public class Gl10b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long st1, en1, st2, en2;
        st1 = System.nanoTime();
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            array.add(i);
        }
        RemoveEvery2 del = new RemoveEvery2(array);
        System.out.println("del " + del.deleteElements());
        en1 = System.nanoTime();
        st2 = System.nanoTime();
        LinkedList<Integer> array2 = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            array2.add(i);
        }
        
        
        RemoveEvery2 del2 = new RemoveEvery2(array2);
        System.out.println("del " + del2.deleteElement());
        en2 = System.nanoTime();
        System.out.println("en1 - st1 " + (en1 - st1)+ " en2 - st2 "+(en2 - st2));
    }
}
