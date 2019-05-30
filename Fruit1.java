public class Fruit{
    private String shape;
    private String color;
    private String name;

    public  Fruit(){

    }
    public Fruit(String fruitshape,String color){
        shape=fruitshape;
        this.color=color;
        this.name=name;
    }
    public void setShape(String shape){
        this.shape=shape;
    }
        public String getShape(){
            return shape;
        }
     @Override
     public String toString(){
         return shape + " " + color + " " + name;

     } 
}