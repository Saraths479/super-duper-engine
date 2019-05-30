public class Number{
    public static void main(String[]args){
        double number=5.8;
        int intNumber=(int)number;
        System.out.println(number);
        System.out.println(intNumber);
        String card="one";
        switch(card){
            case "one":System.out.println("1st card");
                    break;
            case "two":System.out.println("2nd card");
                    break;
            case "ten":System.out.println("10 th card");
                    break;
            default: System.out.println("no card");
        }              
        if(number>0)
            System.out.println("The number is positive");
        else if(number<0)
            System.out.println("The number is negative");
        else
            System.out.println("The number is zero");

    }

}