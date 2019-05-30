public class Driver{
    public static void main(String[]args){
        Car suzuki=new Car();
        Car honda= new Car("Honda","Red",5);

        System.out.println(suzuki.company+" "+suzuki.color+" "+suzuki.noOfSeats);
        System.out.println(honda.company+" "+honda.color+""+honda.noOfSeats);

        suzuki.setCompany("Suzuki");
        suzuki.setColor("Blue");
        suzuki.setNoOfSeates(7);
        System.out.println(suzuki.company+" "+suzuki.color+" "+suzuki.noOfSeats);

        suzuki.setColor("Blue");
        suzuki.setNoOfSeates(7);
        String comp=suzuki.getCompany();
        if(suzuki.getCompany()!="Honda")
            System.out.println(suzuki.getCompany()+" "+suzuki.color+" "+suzuki.noOfSeats);
        else
        System.out.println(comp);  
    }
} 