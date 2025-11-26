import javax.script.ScriptContext;
import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        int[] arr2 = {10,20,30,40,50,60,70,80,90,100,110};

         try {

             System.out.println("10th Elemennt : "+arr2[9]);
         }catch (ArrayIndexOutOfBoundsException e){
             System.out.println("Array limit is "+arr2.length+" but you try to access "+9+" element:");
             System.out.println("Exception Error: "+e.getMessage());
             e.printStackTrace();
         }
        System.out.println("program countinues...");

    }
}
