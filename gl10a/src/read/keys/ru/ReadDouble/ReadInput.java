package read.keys.ru.ReadDouble;

import java.util.Scanner;

public class ReadInput implements IReadInput{
    public ReadInput(){
        
    }
    @Override
    public double readDouble(){
        Scanner a = new Scanner(System.in);
        System.out.println("введте число");
        int i = 0;
        while(i < 3){
            if (!a.hasNextDouble()){
            System.out.println("повторите ввод, ошибка ввода");
            i++;
            a.next();
            continue;
            }
            return a.nextDouble();
        }
        System.exit(0);
        return 0;
    }
}
