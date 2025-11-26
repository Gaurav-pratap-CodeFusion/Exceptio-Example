import java.util.Scanner;

public class AgeInvalidException extends Exception{
    public AgeInvalidException(String m) {
        super(m);
    }
}

class checkAge{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age nto verification for the able or not to Drive the car : ");
        int age = sc.nextInt();

        try{
            if(age<18) throw new AgeInvalidException("you are not able to drive car.");
            else System.out.println("you are able to Drive.");

        }catch (AgeInvalidException e){
            System.out.println(e.getMessage());
        }
    }
}
