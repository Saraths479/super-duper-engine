public class Car1{
    int fuel;

    public Car1(){
        fuel=100;
    }
    public void setFuel(int fuel){
        this.fuel=fuel;
    }
    public void go()throws CallOutOfFuelException{
        if(fuel>0)
            System.out.println("I am going at a speed of 60");
        else
            throw new CallOutOfFuelException();    
    }
}