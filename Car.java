public class Car{
    String company;
    String color;
    int noOfSeats;

    public Car(){
        company=null;
        color=null;
        noOfSeats=0;
    }
    public Car(String company,String color,int noOfSeats){
        this.company=company;
        this.color=color;
        this.noOfSeats=noOfSeats;
    }
    public Car(String company,String color){
        this.company=company;
        this.color=color;
    }
    public void setCompany(String company){
        this.company = company;

    }
    public void setColor(String color){
        this.color=color;
    } 
    public void setNoOfSeates(int noOfSeats){
        this.noOfSeats=noOfSeats;
    } 
    public String getCompany(){
        return company;
    }
    public String getColor(){
        return color;
    }
    public int getNoOfSeates(){
        return noOfSeats;
    }
    public void addseats(int seats){
        noOfSeats=noOfSeats+seats;
    }
    public void print(){
        System.out.println(this.company+" "+this.color+" "+this.noOfSeats);
    }
}