import java.io.*;
import java.util.*;

public class FileHandling_UserInput {
    public static void main(String [] args) throws IOException{
        FileOutputStream fos= new FileOutputStream("Test.txt");

        Scanner s= new Scanner(System.in);
        String userInput= s.nextLine();
        byte [] b= userInput.getBytes();
        fos.write(b);

        fos.close();
    }
}
