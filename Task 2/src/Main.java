import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
readInput();

    }
    public static void readInput(){
        System.out.println("please type your name.");
        Scanner input = new Scanner(System.in);
                String s = input.nextLine();

                //upper case to the first letter in the name
        s = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
        System.out.println("hallo " +s+ "!");
        System.out.println("Please type your age:");

        int age = Integer.parseInt(input.nextLine());
        System.out.println("you are " +age+ " years old.");
        int retirementAge = 67;
        int result = retirementAge-age;
        System.out.println("Retirement age is 67. "+"you retire in "+result+ " years.");

    }

}