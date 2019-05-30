public class DriverInter implements Inter,Inter1{
    public void sayHello(){
        System.out.println("hello");
    }

    public void sayGoodBye(){
        System.out.println("Good Bye");
    }
    public static void main(String[]args){
        Driver d = new Driver();
        d.sayHello();
        d.saySomething("bye");
        d.sayGoodBye();
    }
}