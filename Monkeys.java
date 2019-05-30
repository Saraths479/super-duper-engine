public class Monkeys extends Animal{
    boolean climb;

    public Monkeys(){
        this.says=null;
        this.legs=0;
        this.climb=false;
    }
    public Monkeys(String says,int legs,boolean climb){
        this.says=says;
        this.legs=legs;
        this.climb=climb;
    }

    public void setClimb(boolean climb){
        this.climb=climb;
    }
    public boolean getClimb(){
        return climb;
    }
    public void print(){
        if(climb)
        System.out.println("I am"+says+",Monkey"+legs+"HI");
        else
        System.out.println("hi"+says+",I am"+legs+"Monkey");
    }
    public void print(boolean c){
        if(c)
                System.out.println("climb");
        else
                System.out.println("not climb");
    }

    public String toString() {
        if(climb)
            return " I "+ says + ",am "+ legs + " Monkey ";
        else
            return " I "+ says + ",am not "+legs+"climb";
    }

}