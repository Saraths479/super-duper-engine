import java.util.ArrayList;

public class FruitDriver {

    public static void display(Fruit[]fruits){
        for(int i=0;i<fruits.length;i++)
            System.out.println(fruits[i]);

    }
    public static void main(String[] args) {
        Fruit Watermelon=new fruit("Round","Green","Watermelon");
        System.out.println();
        

        Fruit[] fruits = new Fruit[3];
        fruits[0]=new Fruit("Long","Yellow","banana");
        fruits[1]=watermelon;
        fruit[2]= new Fruit("Round","Red","Apple");
        FruitDriver driver = new FruitDriver();
         driver.display(fruits);

         ArrayList<Fruit> fruitList = new ArrayList<>();
         fruitList.add(Watermelon);
         fruitlist.add(new Fruit("Long","Yellow","Banana"));
         fruitlist.add(new Fruit("Round","Red","Apple"));
         System.out.println(fruitList);

         fruitList.remove(2);
         System.out.println(fruitList);
         
    }
}