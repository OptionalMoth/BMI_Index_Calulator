import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {

        System.out.println("BMI Index Calculator");
        System.out.println("What is your Height in cm (Press Enter)");
        Scanner in = new Scanner(System.in);
        float h = in.nextFloat();

        System.out.println("What is your Weight ");
        float w = in.nextFloat();
        float cm_m = (h/100)*(h/100);
        float BMI = w/cm_m;
        System.out.println("Your BMI "+BMI);

        // condition 1
        if (BMI <= 16)
            System.out.println("You are Staving");
        else if (BMI <16.99)
            System.out.println("You are Emaciation");
        else if (BMI <18.49)
            System.out.println("You are Underweight");
        else if (BMI < 22.99)
            System.out.println("You are Normal, low range");
        else if (BMI < 24.99)
            System.out.println("You are Normal, high range");
        else if (BMI < 27.49)
            System.out.println("You are Overweight, low range");
        else if (BMI < 29.99)
            System.out.println("You are overweight, high range");
        else if (BMI < 34.9)
            System.out.println("You are 1st degree obesity");
        else if (BMI < 39.9)
            System.out.println("You are  2nd degree obesity");
        else if (BMI >= 40)
            System.out.println(" 3rd degree obesity");

    }

}