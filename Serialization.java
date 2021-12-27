import java.io.*;

class Student implements Serializable {
    private String name;
    private int sem;

    public Student(String name, int sem) {
        this.name = name;
        this.sem -= sem;
    }

    public void display() {
        System.out.println(this.name + " " + this.sem);
    }
}

public class Serialization {
//        public static void main(String [] args) throws IOException{
//             Student s= new Student("Nikesh",3);
//             FileOutputStream fos=new FileOutputStream("Stest.txt");
//             ObjectOutputStream oos= new ObjectOutputStream(fos);
//
//             oos.writeObject(s);
//             oos.close();
//             fos.close();
//        }

    public static void main(String [] args) throws IOException,ClassNotFoundException{
        Student s= new Student("Nikesh",3);
        FileInputStream fis=new FileInputStream("Stest.txt");
        ObjectInputStream ois= new ObjectInputStream(fis);

        Student obj= (Student)ois.readObject();
        obj.display();
        ois.close();
        fis.close();
    }
}
