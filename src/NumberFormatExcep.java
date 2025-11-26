import javax.script.ScriptContext;
import java.util.Scanner;

public class NumberFormatExcep extends Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name="->";
        System.out.println(name);
        System.out.print("Enter any value: ");
        String fi = sc.nextLine();
        name+=fi;
        System.out.print("Enter any value: ");
        String se = sc.nextLine();
        name+=se;
        System.out.print("Enter any value: ");
        String th = sc.nextLine();
        name+=th;
        System.out.print("Enter any value: ");
        String fo = sc.nextLine();
        name=name+fo;
        System.out.print("Enter any value: ");
        String fi5 = sc.nextLine();
        name=name+fi5;
        System.out.print("Enter any value: ");
        String si = sc.nextLine();
        name=name+si;
        System.out.println(name);




//        try{
//            int num = Integer.parseInt(in);
//            System.out.println("you have entered "+num);
//        }catch(NumberFormatException e){
//            System.out.println("Error : you have ho enter only digit!");
//            System.out.println(e.getMessage());
//        }
    }
}