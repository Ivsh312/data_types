package create.File.ru;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CreateFile implements ICreateFile{
    private String FileName;
    private ArrayList <Double> array;
    public CreateFile(String FileName, ArrayList <Double> array){
        this.FileName = FileName;
        this.array = array;
    }
    public String getFileName(){
        return this.FileName;
    }
    public void setFileName(String FileName){
        this.FileName = FileName;
    }
     public void setArray(ArrayList <Double> arrayList){
        this.array = array;
    }
    public ArrayList <Double> getArrey(){
        return this.array;
    }
    public void createFileWithNambersDerection(){ 
        File f = new File(this.FileName);
        FileWriter fw = null;
        BufferedWriter bf = null;
        PrintWriter pw = null;
        String b;
        Iterator<Double> iter;
        
        try{
            fw = new FileWriter(f);
            bf = new BufferedWriter(fw);
            pw = new PrintWriter(bf);
            iter = array.iterator();
            while (iter.hasNext()) {
                b = (String.valueOf(iter.next()))+" ";
                pw.printf(b);
            }           
        }catch (IOException e){
            System.err.println("не удалось записать, ошибка открытия потока");
        }finally{
                try {
                    pw.close();
                }catch(Exception e){
                    System.err.println("ошибка закрытия потока");
                }
            }
    }
    public void createFileWithNambersRevers(){
        ArrayList <Double> buffArray = this.array; 
        File f = new File(this.FileName);
        FileWriter fw = null;
        BufferedWriter bf = null;
        PrintWriter pw = null;
        String b;
        Iterator<Double> iter;
        try{
            fw = new FileWriter(f);
            bf = new BufferedWriter(fw);
            pw = new PrintWriter(bf);
            Collections.reverse(buffArray);
            iter = buffArray.iterator();
            while (iter.hasNext()) {
                b = (String.valueOf(iter.next()))+" ";
                pw.printf(b);
            }           
        }catch (IOException e){
            System.err.println("не удалось записать, ошибка открытия потока");
        }finally{
                try {
                    pw.close();
                }catch(Exception e){
                    System.err.println("ошибка закрытия потока");
                }
            }
    }
}
