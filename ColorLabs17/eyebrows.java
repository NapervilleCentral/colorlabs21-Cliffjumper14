import java.util.*;
import java.util.Scanner;
public class eyebrows
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Let Elena do your eyebrows?(yes to confirm): ");
        String brow = "";
        brow = keyboard.nextLine();
        while(    (!((brow.equals("yes")) || (brow.equals("Yes")))) && (!((brow.equals("no")) || (brow.equals("No"))))                    ){
            System.out.println("Let Elena do your eyebrows?(yes to confirm): ");
            brow = keyboard.nextLine();
            if ((brow.equals("yes")) || (brow.equals("Yes"))){
                System.out.println("Elena will do your eyebrows");
            }
            if ((brow.equals("no")) || (brow.equals("No"))){
                System.out.println("Elena will slime you out");
            }
        }
    }
}
