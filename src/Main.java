import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

       double springCost;
       double summerCost;
       double autumnCost;
       double winterCost;
       double totalCost;

        System.out.println("What was your Maintenance cost this spring?");
        springCost = in.nextDouble();
        System.out.println("What was your Maintenance cost this summer?");
        summerCost = in.nextDouble();
        System.out.println("What was your Maintenance cost this autumn?");
        autumnCost = in.nextDouble();
        System.out.println("What was your Maintenance cost this winter?");
        winterCost = in.nextDouble();
        totalCost = springCost + summerCost + autumnCost + winterCost;
        System.out.println("The total cost is: " + totalCost + " Your spring cost was " + springCost + " Your summer cost was " + summerCost + " Your autumn cost was " + autumnCost + " Your winter cost was " + winterCost);



    }
}