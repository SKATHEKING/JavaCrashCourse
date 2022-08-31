import java.util.*;



public class CrashCourse {

    public static void main(String[] args){

        //print out the system
        System.out.println("Hello World!");

        //set variable in java
        int favouriteNumber = 3;

        //print out variable
        System.out.println(favouriteNumber);

        String name = "Mateus Goncalves De Ouro";
        int age = 24;

        System.out.println("My name is " + name + " and I am " + age + " years old.");

        //make array
        int[] numbers = {111, 222 ,333 ,444 ,555, 666 ,777};

        //make an arraylist
        ArrayList<String> names = new ArrayList<String>();

        names.add("mateus");
        names.add("Sol");
        names.add("Tomas");
        names.add("Leo");
        names.add("Dona");

        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
        //hashmap
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("me","Mateus");
        map.put("friend","Tomas");

                System.out.println(map.get("me"));

    }
}
