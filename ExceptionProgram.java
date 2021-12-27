

public class ExceptionProgram {
    public static void main(String[] args)throws Exception{
        String [] s= {"Nikehs","sujan"};
        try{
            System.out.println(s[2]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds dtected");
        }
    }
}