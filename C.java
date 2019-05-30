public abstract class C implements AA,AB{
    public void sayAA(){
        System.out.println("A");
    }
    public void say(){
        System.out.println("say");
    }
    abstract public void sayAB();
}