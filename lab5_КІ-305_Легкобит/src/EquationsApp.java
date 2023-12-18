import java.io.*;

public class EquationsApp {
    public static void main(String[] args) throws IOException {

        int temp = 11;


        try {

            DataOutputStream f = new DataOutputStream(new FileOutputStream("fd.bin"));
            f.writeInt(temp);
            f.close();




        } catch (IOException e) {
            System.out.println(e);
        }


    }

}