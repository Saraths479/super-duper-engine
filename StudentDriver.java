import java.util.Scanner;

public class StudentDriver{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of students:");
        int n=scan.nextInt();
        Student[]students=new Student[n];
        Student student;
        int c=0;
        String name;
        int rollno;
        String classtudying;
        int age;
        for(int i=0;i<n;i++){
            System.out.println();
            System.out.println("Enter Student"+(i+1)+"Details:");
            System.out.print("Enter name:");
            scan.nextLine();
            name=scan.nextLine();
            System.out.print("Enter rollno");
            rollno=scan.nextInt();
            System.out.print("Enter classstudying");
            scan.nextLine();
            classtudying=scan.nextLine();
            System.out.println("Enter age:");
            age=scan.nextInt();
            student=new Student(name,rollno,classtudying,age);

            boolean check=false;
            try{
                check=student.checkAge();
            }catch(StudentUnderAgeException sue){
                System.err.println(sue);
            }finally{
                if(check)
                    students[c++]=student;
            }
        }
        for(int i=0;i<c;i++){
            System.out.println();
            System.out.println("Student"+(i+1)+"Details");
            students[i].print();
        }
    }
}