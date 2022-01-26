import java.lang.Math;
import java.util.Scanner;

public class BMI {
    private double height;
    private double weight;
    private double BMIIndex;

    public BMI (double height, double weight){
        this.height = height;
        this.weight = weight;
    }

    public double getHeight()
    {
        return this.height;
    }

    public double getWeight()
    {
        return this.weight;
    }
    
    public double getBMI()
    {
        double weightKilos = weight* 0.45359237;
        double heightMeters = height * 0.0254;
        this.BMIIndex = weightKilos / Math.pow(heightMeters, 2);
        return this.BMIIndex;
    }

    public String interpretation()
    {
        if (this.BMIIndex < 18.5)
        {
            return "Underweight";
        }
        else if (this.BMIIndex < 25.0)
        {
            return "Normal";
        }
        else if (this.BMIIndex < 30.0)
        {
            return "Overweight";
        }
        else
        {
            return "Obese";

        }
  
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double userWeight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double userHeight = input.nextDouble();
        BMI NewBMI = new BMI(userHeight, userWeight);
        System.out.println("BMI is " + NewBMI.getBMI());
        System.out.println(NewBMI.interpretation());
        input.close();

    }

    
}
