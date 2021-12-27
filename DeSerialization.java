import java.io.*;

class StudentD implements Serializable {
    private String name;
    private int sem;

    public StudentD(String name, int sem) {
        this.name = name;
        this.sem -= sem;
    }

    public void display() {
        System.out.println(this.name + " " + this.sem);
    }
}


public class DeSerialization {
    public static void main(String [] args) throws IOException,ClassNotFoundException{
        StudentD s= new StudentD("Nikesh",3);
        FileInputStream fis=new FileInputStream("Stest.txt");
        ObjectInputStream ois= new ObjectInputStream(fis);

        StudentD obj= (StudentD)ois.readObject();
        obj.display();
        ois.close();
        fis.close();
    }
}
