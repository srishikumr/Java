import java.util.Scanner;

public class areaOfCricle {
    public static void main(String[] args) {
        try(Scanner val = new Scanner(System.in)){
            System.out.println("Enter raduis");
            double r = val.nextDouble();
            double area = 3.14*r*r;
            System.out.println("Area: "+ area);
        }
    }
}



