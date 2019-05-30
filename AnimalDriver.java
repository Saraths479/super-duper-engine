public class AnimalDriver{
    public static void main(String[]args){
        Animal lion=new Animal("Lion",4);
        lion.print();

        Lion abc=new Lion("Roar!!",5,true);
        abc.print();
        abc.print(true);

        Animal lion1=abc;  //Lion->Animal
        lion1.print();

        System.out.println(lion);
        System.out.println(abc);

    }
}