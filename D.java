public class D extends C{
    public void sayAB(){
        System.out.println("B");
    }
    public static void main(String[]args){
        D d=new D();
        d.sayAA();
        d.sayAB();
        d.say();
        
    }
}