public class DriverCar{
    public static void main(String[]args) {
        Car1 car=new Car1();

        try{
            car.go();
        }catch(Exception e){
            System.err.println(e);
        }
        car.setFuel(0);
        try{
            car.go();
        }catch(Exception e){
            System.err.println(e);
        }
    }
}