import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMisMatchException {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            try{
                System.out.println("Enter your Age : ");
                int num1=sc.nextInt();

                System.out.println("Your age is :" +num1);
            }catch (InputMismatchException e){
                System.out.println("Error : Please enter digit!");
            }catch (Exception e){
                System.out.println("Invalid input!");
            }



        }


}
