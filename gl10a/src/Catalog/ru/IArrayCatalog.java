package Catalog.ru;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public interface IArrayCatalog {
    public void massDir(String dir);
    public ArrayList<File> list(File f) throws IOException ;
    public String toString();
}
