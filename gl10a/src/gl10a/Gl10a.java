package gl10a;

import create.File.ru.CreateFile;
import Generate.randomDouble.ru.Generate;
import Input.paramsChek.ru.InputParams;
import MNK.ru.*;
import Reding.Double.ru.Reading;
import Set.metchods.ru.Sets;
import Sorting.ru.SortArray;
import SwitchStack.ru.SwitchStack;
import static java.lang.System.exit;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import read.keys.ru.ReadDouble.ReadInput;
import workWithInput.PrintDoubleRevers;
import Mistake.ru.CounLogicalException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.SortedMap;
import java.util.TreeMap;
import polinom.ru.Polinom;
import replais.befoZeroAndAfter.ru.Replays;
import setSumAllElements.ru.SumElementsSet;

public class Gl10a {

    public static void main(String[] args) {

        //generate file with random nambers
        InputParams par = new InputParams();
        String fileName = par.chekFileName();
        Generate random = new Generate(13);
        CreateFile a = new CreateFile(fileName, random.getRandom());
        a.createFileWithNambersDerection();
        System.out.println("---------------------------------");

        //revers orde of numbers and write in fle
        Reading read = new Reading(fileName);
        ArrayList<Double> listInArray = read.readDouble();
        System.out.println(listInArray);
        a.setArray(listInArray);
        a.createFileWithNambersRevers();
        System.out.println("---------------------------------");

        /*
        select all the punctuation marks in file, if "num",
        get the words, if "words", 
        get the frequency of fishing if "wordsFrequency"
         */
        ReadInput doubleInput = new ReadInput();
        PrintDoubleRevers rev = new PrintDoubleRevers(doubleInput.readDouble());
        rev.reversDouble();
        read.setFileName(par.chekFileName());
        ArrayList<String> listInArray2 = read.readString("words");
        for (String a2 : listInArray2) {
            System.out.println(a2);
        }
        System.out.println("---------------------------------");

        //sorting test
        SortArray sorting = new SortArray(listInArray2);
        sorting.sortAray();
        System.out.println();
        for (String a2 : listInArray2) {
            System.out.println(a2);
        }
        System.out.println("---------------------------------");

        //test switch in stacks
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        for (int i = 0; i < 4; i++) {
            s1.add(i);
            s2.add(i * 10);
        }
        System.out.println(s1);
        System.out.println(s2);
        SwitchStack switching = new SwitchStack(s1, s2);
        switching.switchElementsStack();
        s1 = switching.getStak1();
        s2 = switching.getStak2();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("---------------------------------");

        //Remove similar items in Sets
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        for (int i = 0; i < 4; i++) {
            set1.add(i);
            set2.add(i);
        }
        set2.add(909939);
        Sets sets = new Sets();
        System.out.println(sets.insertSets(set1, set2));
        System.out.println("---------------------------------");

        //MNK
        Stack<Double> I = new Stack<Double>();
        ArrayDeque<Double> U = new ArrayDeque<Double>();
        for (int i = 1; i < 4; i++) {
            I.add((double) i);
            U.add((double) i);
        }
        MNK mnk = new MNK(I, U);
        try {
            System.out.println(mnk.MNKForR());
        } catch (CounLogicalException e) {
            System.err.println("деление на 0");
            exit(0);
        }
        System.out.println("---------------------------------");

        //summ all elements
        LinkedHashSet<Double> sets1 = new LinkedHashSet<Double>() {
            {
                this.addAll(random.getRandom());
            }
        };
        SumElementsSet setElem = new SumElementsSet(sets1);
        System.out.println(setElem.sumElements());
        System.out.println("---------------------------------");

        //summ 2 polinoms. maps
        HashMap<Integer, Double> Map1 = new HashMap<Integer, Double>();
        HashMap<Integer, Double> Map2 = new HashMap<Integer, Double>();
        for (int i = 0; i < random.getRandom().size(); i++) {
            if (i == 3) {
                continue;
            }
            Map2.put(i, random.getRandom().get(i));
            Map1.put(i, random.getRandom().get(i));
        }
        Polinom polinom = new Polinom(Map1, Map2);
        SortedMap<Integer, Double> sortedMap = new TreeMap<Integer, Double>(new Comparator() {
            @Override
            public int compare(Object k1, Object k2) {
                return k1.hashCode() - k2.hashCode();
            }
        });
        System.out.println("get1 " + polinom.getParamsPolinom1());
        System.out.println("get2 " + polinom.getParamsPolinom2());
        sortedMap = polinom.summPolinoms();
        ArrayList<Integer> buffKey = new ArrayList<Integer>(sortedMap.keySet());
        ArrayList<Double> buffValue = new ArrayList<Double>(sortedMap.values());
        System.out.println("polinoms: ");
        System.out.println("sortedMap.keySet() " + sortedMap.keySet());
        System.out.println("key " + buffKey);
        System.out.println("Value " + buffValue);
        System.out.println("---------------------------------");

        //product  polinoms ArrayList
        ArrayList<Double> product = new ArrayList<Double>();
        LinkedList<Double> product2 = new LinkedList<Double>();
        for (int i = 1; i < 3; i++) {
            product.add((double) i);
            product2.add((double) i);
        }
        System.out.println("product " + product);
        System.out.println("product2 " + product2);
        Polinom polinom2 = new Polinom(product, product2);
        System.out.println(polinom2.proizvPolinoms());
        product.clear();
        System.out.println("---------------------------------");

        //get frequance  words            
        int j = 10;
        for (int i = 0; i < 5; i++) {
            product.add((double) j);
            j -= 7;
        }
        System.out.println("product " + product);
        Replays rep = new Replays(product);
        System.out.println("rep " + rep.replays());
        read.setFileName("abc2.txt");
        read.readString("num");
        System.out.println("words + " + read.getWords());
        read.setFileName("abc2.txt");
        read.readString("wordsFrequency");
        System.out.println("frequance + " + read.getWordsFrequance());
    }
}
