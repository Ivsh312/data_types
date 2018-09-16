package Input.paramsChek.ru;

import Mistake.ru.CounLogicalException;
import static java.lang.System.exit;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class InputParams {

    public static String chekFileName(){
        String returnFileName = null;
        System.out.println("input file name ");
        Scanner in = new Scanner(System.in);
        Pattern p = Pattern.compile("[A_Za-z0-9_!~=+-]+\\.[A_Za-z0-9_!~=+-]+");
        int i = 3;
        try{
            returnFileName = in.nextLine();
            Matcher m = p.matcher(returnFileName);
            while (i>0){
             if (!m.matches()){
                 System.out.println("file name is not correct, repit input file name");
                 returnFileName = in.nextLine();
                 m = p.matcher(returnFileName);
                 continue;
             }
             return returnFileName;
            }

             if (i<0){
                throw new CounLogicalException();
            }
        }catch(CounLogicalException e){
            System.err.println("некоректное название файла");
            exit(0);
        }
        return returnFileName;
    }
}
