/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delite.elemetArray.ru;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Lenovo
 */
public class RemoveEvery2 {
    private ArrayList <Integer> piopleArray = new ArrayList<Integer>();
    private LinkedList <Integer> piopleLinked = new LinkedList<Integer>();
    public RemoveEvery2 (ArrayList <Integer> piopleArray){
        this.piopleArray = piopleArray;
    }
    public RemoveEvery2 (LinkedList <Integer> piopleLinked){
        this.piopleLinked = piopleLinked;
    }
    public void setPiopleArray(ArrayList <Integer> piopleArray){
        this.piopleArray = piopleArray;
    }
    public void setPiopleLinked(LinkedList <Integer> piopleLinked){
        this.piopleLinked = piopleLinked;
    }
    public ArrayList <Integer> getPiopleArray(){
        return this.piopleArray;
    }
    public LinkedList <Integer> getPiopleLinked(){
        return this.piopleLinked;
    }
    public ArrayList <Integer> deleteElements(){
        ArrayList <Integer> piopleArray2 = this.piopleArray;
        while (true){
            if (piopleArray2.size()==1){
                break;
            }
            for (int i = 1; i < piopleArray2.size(); i++){
                System.out.println("piopleArray2 " + piopleArray2);
                piopleArray2.remove(i);
                
            }
        }
        return piopleArray2;
    }
    public LinkedList <Integer> deleteElement(){
        LinkedList <Integer> piopleLink = this.piopleLinked;
        System.out.println("size " + piopleLinked);
        System.out.println("piopleLink "+piopleLink);
        while (true){
            for (int i = 1; i < piopleLink.size(); i++){
                System.out.println("@");
                System.out.println("piopleArray2 " + piopleLink);
                piopleLink.remove(i);
            }
            if (piopleLink.size()==1){
                break;
            }
        }
        return piopleLink;
    }
}
