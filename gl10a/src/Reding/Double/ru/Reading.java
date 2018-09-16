package Reding.Double.ru;

import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class Reading implements IReadingDouble {

    HashSet<String> words = new HashSet<>();
    HashMap<String, Integer> wordsMap = new HashMap<String, Integer>();
    private String fileName;

    public Reading(String fileName) {
        this.fileName = fileName;
    }

    public HashMap<String, Integer> getWordsFrequance() {
        return this.wordsMap;
    }
    public HashSet<String> getWords() {
        return this.words;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return this.fileName;
    }

    public ArrayList<Double> readDouble() {
        ArrayList<Double> doublesElenents = new ArrayList<Double>();
        Scanner scan;
        File f;
        Double d;
        try {
            f = new File(this.fileName);
            scan = new Scanner(f);
            scan.useLocale(Locale.ENGLISH);
            while (scan.hasNext()) {
                if (scan.hasNextDouble()) {
                    d = scan.nextDouble();
                    doublesElenents.add(d);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("проблема чтения файла");
            exit(0);
        }
        return doublesElenents;
    }

    public ArrayList<String> readString(String type) {
        System.out.println("type " + type);
        ArrayList<String> Elenents = new ArrayList<String>();
        Scanner scan;
        File f;
        String d;
        switch (type) {
            case "num":
                try {
                    f = new File(this.fileName);
                    scan = new Scanner(f);
                    scan.useLocale(Locale.ENGLISH);
                    scan.useDelimiter("[^A-z]+");
                    while (scan.hasNext()) {
                        d = scan.next();
                        words.add(d.toLowerCase());
                    }
                } catch (FileNotFoundException e) {
                    System.err.println("проблема чтения файла");
                    exit(0);
                }

            case "words":
                try {
                    f = new File(this.fileName);
                    scan = new Scanner(f);
                    scan.useLocale(Locale.ENGLISH);
                    scan.useDelimiter("\\n");
                    while (scan.hasNext()) {
                        d = scan.next();
                        Elenents.add(d);
                    }
                } catch (FileNotFoundException e) {
                    System.err.println("проблема чтения файла");
                    exit(0);
                }
                return Elenents;
            case "wordsFrequency":
                int key;
                 try {
                    f = new File(this.fileName);
                    scan = new Scanner(f);
                    scan.useLocale(Locale.ENGLISH);
                    scan.useDelimiter("[^A-z]+");
                    while (scan.hasNext()) {
                        d = scan.next();
                        d = d.toLowerCase();
                        System.out.println("d "+d);
                        if (this.wordsMap.containsKey(d)) {
                            key = this.wordsMap.get(d);
                            this.wordsMap.put(d, (++key));
                        } else {
                            this.wordsMap.put(d, 1);
                        }
                    }
                    
                }  catch (FileNotFoundException e) {
                    System.err.println("проблема чтения файла");
                    exit(0);
                }
                return Elenents;
            default:
                System.out.println("не коректный тип, до свидания");
                exit(0);
                return Elenents;
        }

    }
}
