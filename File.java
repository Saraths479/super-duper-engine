import java.util.Scanner;
import java.io.FileReader;

public class File{
    public static void main(String[]args){
        FileReader file = null;
        try{
            file=new FileReader("in.txt");

        }catch(Exception e){
            System.out.println("file doesnot exist");
        }
        Scanner scan=new Scanner(file);
        int roll=scan.nextInt();
        String c=scan.next();
        scan.nextLine();
        String name = scan.nextLine();
        String univ = scan.nextLine();
        System.out.println(roll);
    }
}