package Reding.Double.ru;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public interface IReadingDouble {
    public HashSet<String> getWords();
     public void setFileName(String fileName);
     public String getFileName();
     public ArrayList<Double> readDouble();
     public ArrayList<String> readString(String type);
}
