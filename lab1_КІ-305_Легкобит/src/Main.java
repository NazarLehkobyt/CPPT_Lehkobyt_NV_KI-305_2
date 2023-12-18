import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        Main readBin = new Main();
        int nRows;
        char[][] arr;
        nRows = readBin.readResultBin("fd.bin");

        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);
        System.out.print("Введіть розмір квадратної матриці: ");


        int firstLayer = nRows / 4;
        int secondLayer = firstLayer * 2;
        arr = new char[nRows][];
        for(int i = 0; i < nRows; i++) {
            if(i < firstLayer || i > nRows - firstLayer - 1){
                arr[i] = new char[nRows];
            }else{
                arr[i] = new char[secondLayer];
            }
        }

        System.out.print("\nВведіть символ-заповнювач: ");
        filler = in.nextLine();
        int counterForColl = nRows - secondLayer;
        int counterForRows;
        boolean run;
        exit:
        for(int i = 0; i < nRows; i++)
        {
            run = true;
            counterForRows = 0;
            for(int j = 0; j < arr[i].length; j++)
            {
                if(filler.length() == 1)
                {
                    arr[i][j] = (char) filler.codePointAt(0);
                    if ((i == 0 || i == nRows - 1) && j % 2 != 0) {
                    arr[i][j] = '!'; // Інший символ для непарних позицій
                }
                    if(i > firstLayer - 1  && i < nRows - firstLayer){
                        if(j == (arr[i].length / 2)){
                            while(run){
                                System.out.print("  ");
                                fout.print("  ");
                                ++counterForRows;
                                if(counterForRows == counterForColl){
                                    run = false;
                                }
                            }
                        }
                    }
                    System.out.print(arr[i][j] + " ");
                    fout.print(arr[i][j] + " ");
                }
                else if (filler.length() == 0)
                {
                    System.out.print("\nНе введено символ заповнювач");
                    break exit;
                }
                else
                {
                    System.out.print("\nЗабагато символів заповнювачів");
                    break exit;
                }
            }
            System.out.print("\n");
            fout.print("\n");
        }
        fout.flush();
        fout.close();

    }
    public int readResultBin(String fName) throws IOException {
        try (DataInputStream f = new DataInputStream(new FileInputStream(fName))) {
            int result = f.readInt();
            return result;
        }
    }
}