import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        double height, weight ,bmi;
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter your height(m)");
        height = stdin.nextDouble();
        System.out.println("Enter your weight(kg)");
        weight = stdin.nextDouble();

        bmi = weight / Math.pow(height, 2);

        System.out.println("Your BMI is" + bmi);
    }
}
