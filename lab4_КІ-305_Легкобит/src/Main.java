import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @version 1.0
 * @author
 */
public class Main
{
    public static void main(String[] args)
    {
        PrintWriter fout = null;
        try
        {
            System.out.print("Enter file name: ");
            Scanner in = new Scanner(System.in); // просимо користувача ввести назву файлу, у котрий записати результат
            String fName = in.nextLine();
            fout = new PrintWriter(new File(fName)); // Відкриваєм файл для запису

            Calculation calculation = new Calculation();
            System.out.print("Enter X: "); //Просимо користувача ввести число
            var x = calculation.Calculate(in.nextInt()); // проводим обрахунок
            fout.print(x); // записуєм результат у файл
            System.out.println("Result: " + x);
        }
        catch (MyException ex) // Ловимо помилки
        {
            System.out.println(ex.getMessage());
        }
        catch (FileNotFoundException e)
        {
            System.out.print("Exception reason: Perhaps wrong file path \n" + e.getMessage());
        }
        finally // закриваємо файл
        {
            fout.flush();
            fout.close();
        }
    }
}