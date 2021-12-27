import java.io.*;
import java.util.*;

public class FileHandling_Choice {
  public static void main(String [] args) throws IOException{
       FileOutputStream fos=new FileOutputStream("UserInput.txt");
       DataOutputStream dos= new DataOutputStream(fos);

       Scanner sc=new Scanner(System.in);
       String prompt;
       do{
           System.out.println("Enter name");
           String name= sc.nextLine();
           System.out.println("Enter Semester");
           int sem= Integer.parseInt(sc.nextLine());
           System.out.println("Enter Faculty");
           String faculty= sc.nextLine();

           dos.writeUTF(name);
           dos.writeInt(sem);
           dos.writeUTF(faculty);

           System.out.println("So you want to continue?Type no to exit");
           prompt= sc.nextLine();
       }while(!prompt.toLowerCase().equals("no"));

       dos.close();
       fos.close();
    }
}
