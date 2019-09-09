import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFun {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();                       // Creating an ArrayList to hold colors
        Scanner keyboard = new Scanner(System.in);
        String color;
        String answer;

        colors.add("red");
        colors.add("green");
        colors.add("blue");

        for(String hue : colors) {
            System.out.println(hue);
        }

        System.out.println();
        System.out.println("The color at index 1 is: " + colors.get(1));    // Printout of color at index 1
        System.out.println();

        do {
            System.out.print("Enter a color to add to the list: ");         // User enters colors
            color = keyboard.nextLine();
            colors.add(color);
            System.out.println();

            System.out.println("Do you want to continue entering colors? (enter \"q\" to quit)");
            answer = keyboard.nextLine();
            System.out.println();
        }
        while(! answer.equalsIgnoreCase("q"));

        for(String hue : colors) {
            System.out.println(hue);
        }
    }
}
