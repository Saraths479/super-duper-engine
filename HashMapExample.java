import java.util.HashMap;
public class HashMapExample{
    public static void main(String[]args){
        HashMap< Integer,String >studentHashMap= new HashMap<>();
        studentHashMap.put(1,"Cersie");
        studentHashMap.put(2,"Jamie");
        studentHashMap.put(3,"The Mountain");
        studentHashMap.put(4,"Jaken Hager");
        studentHashMap.put(5,"Daenyraes");
        studentHashMap.put(7,"Jon Snow");

        System.out.println(studentHashMap);
            
        }
    }