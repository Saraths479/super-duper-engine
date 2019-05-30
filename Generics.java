public class Generics<T,G>{
    T variable1;
    G variable2;

    public Generics(T variable1,G variable2){
        this.variable1= variable1;
        this.variable2= variable2;
    }
    public String toString(){
        return "First variable is"+ variable1 + "and Second is"+ variable2;

    }
}