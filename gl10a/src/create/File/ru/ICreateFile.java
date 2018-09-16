package create.File.ru;

import java.util.ArrayList;

public interface ICreateFile {

    public String getFileName();

    public void setFileName(String FileName);

    public void setArray(ArrayList<Double> arrayList);

    public ArrayList<Double> getArrey();

    public void createFileWithNambersDerection();

    public void createFileWithNambersRevers();

}
