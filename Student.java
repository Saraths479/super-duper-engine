public class Student{
    String name;
    int rollNo;
    String ClassStudying;
    int age;

    public Student(String name,int rollNo,String ClassStudying,int age){
        this.name=name;
        this.rollNo=rollNo;
        this.ClassStudying=ClassStudying;
        this.age=age;
    }
    public boolean checkAge()throws StudentUnderAgeException{
        if(age>=18)
            return true;
        else{
            throw new StudentUnderAgeException();
        }
    }
    public void print(){
        System.out.println("Name:"+name);
        System.out.println("Rollno:"+rollNo);
        System.out.println("Class:"+ClassStudying);
        System.out.println("Age:"+age);
    }
}



