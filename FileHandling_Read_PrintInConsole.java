import java.io.*;

public class FileHandling_Read_PrintInConsole {
    public static void main(String [] args) throws IOException{
        FileInputStream fis=new FileInputStream("Test.txt");
        int content;
        while((content=fis.read())!=-1){
             System.out.print((char) content);
        }
        fis.close();
    }
}
