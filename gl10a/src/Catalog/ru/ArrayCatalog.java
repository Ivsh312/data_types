package Catalog.ru;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.imageio.IIOException;

public class ArrayCatalog implements IArrayCatalog{
    ArrayList<File> directori = new ArrayList<File>();
    public void massDir(String dir){
        File fil = new File(dir);
        try{
            directori = list(fil);
        }catch(IOException e){
            System.err.println("не найеден каталог");
        }
    }
    public ArrayList<File> list(File f) throws IOException {        
        File[] filesChekAndAdd = f.listFiles();
        for(int i = 0; i < filesChekAndAdd.length-1; i++){
            if(filesChekAndAdd[i].isDirectory()){
                this.directori.add(filesChekAndAdd[i]);
                list(filesChekAndAdd[i]);
            }
        }
        return this.directori;
    }
    public String toString(){
        return this.directori.toString();
    }
}
