public class GenericsDriver{
    public static void main(String[]args){
     //   Sample<Integer> sampleInteger= new Sample<>(65);
       // System.out.println(sampleInteger);

 //       Sample<String> sampleString = new Sample<>("Hello");
   //     System.out.println(sampleString);

        Generics<Integer,String> example = new Generics<>(5,"Integer");
        System.out.println(example);
    }
}