import java.util.Scanner;
public class scannerObject {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Type any character nigga im tryna practice scanner objects:");
        String anything = input.nextLine();
        System.out.println("Why did you type " + "\"" + anything + "\"");
        input.close();
    }
}
